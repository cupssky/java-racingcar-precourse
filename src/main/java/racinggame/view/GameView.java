package racinggame.view;

import racinggame.command.CommandType;
import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.error.ErrorType;

public class GameView {

    private static final String MOVE_LINE = "-";

    public static void printError(ErrorType errorType) {
        System.out.println(errorType.getMessage());
    }

    public static void printCommendGuide(CommandType commandType) {
        System.out.println(commandType.getGuide());
    }

    public static void printMoveProcess(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getDistance(); i++) {
            printCarMoveLine();
        }
        printNewLine();
    }

    public static void printResult(Cars cars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars.getMaxDistanceCars()) {
            stringBuilder.append(car.getName()).append(",");
        }
        String resultCars = stringBuilder.toString().replaceAll(",$", "");
        System.out.println("최종 우승자는 " + resultCars + " 입니다.");
    }

    public static void printNewLine() {
        System.out.println();
    }

    private static void printCarMoveLine() {
        System.out.print(MOVE_LINE);
    }
}
