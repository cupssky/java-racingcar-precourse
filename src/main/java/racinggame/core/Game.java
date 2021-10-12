package racinggame.core;

import racinggame.command.CommandType;
import racinggame.command.GameCommand;
import racinggame.domain.Cars;

import static racinggame.view.GameView.printCommendGuide;
import static racinggame.view.GameView.printResult;

public class Game {

    private GameCommand gameCommand;

    public Game() {
        gameCommand = new GameCommand();
    }

    public void start() {
        end(gameCommand.startCarNameCommand(), gameCommand.startCarMoveCountCommand());
    }

    private void end(Cars cars, int moveCount) {
        printCommendGuide(CommandType.RESULT);
        process(cars, moveCount);
        printResult(cars);
    }

    private void process(Cars cars, int moveCount) {
        int index = 0;
        while (index < moveCount) {
            cars.move();
            cars.moveProccess();
            index++;
        }
    }
}
