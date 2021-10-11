package racinggame.domain;

public class Car {

    private static final int MOVE_CONDITION_NUMBER = 4;
    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void move(int moveNumber) {
        if (moveNumber >= MOVE_CONDITION_NUMBER) {
            distance++;
        }
    }

    public Car getDistanceOverCar(int distance) {
        return isDistanceOverCar(distance) ? this : null;
    }

    public boolean isDistanceOverCar(int distance) {
        if (this.distance > distance) {
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
