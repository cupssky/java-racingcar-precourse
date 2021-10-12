package racinggame.domain;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static racinggame.view.GameView.*;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }

    public void moveProccess() {
        for (Car car : cars) {
            printMoveProcess(car);
        }
        printNewLine();
    }

    public List<Car> getMaxDistanceCars() {
        List<Car> maxDistanceCars = new ArrayList<>();
        int max = getMaxDistance();

        for (Car car : cars) {
            maxDistanceCars = generateMaxDistanceCars(maxDistanceCars, car, max);
        }
        return maxDistanceCars;
    }

    public int getMaxDistance() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getDistance());
        }
        return max;
    }

    private List<Car> generateMaxDistanceCars(List<Car> maxDistanceCars, Car car, int max) {
        car = car.getMaxDistanceCar(max);
        if (car != null) {
            maxDistanceCars.add(car);
        }
        return maxDistanceCars;
    }
}
