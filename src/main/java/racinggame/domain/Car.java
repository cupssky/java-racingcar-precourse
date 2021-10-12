package racinggame.domain;

public class Car {

    private static final int MOVE_CONDITION_NUMBER = 4;
    private String name;
    private int distance;

    private Car() {}

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void move(int moveNumber) {
        if (moveNumber >= MOVE_CONDITION_NUMBER) {
            distance++;
        }
    }

    public Car getMaxDistanceCar(int max) {
        if (isMaxDistanceCar(max)) {
            return this;
        }
        return null;
    }

    public boolean isMaxDistanceCar(int max) {
        if (distance >= max) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
