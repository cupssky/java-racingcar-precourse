package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final String CAR_TEMP_NAME = "GV60";
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(CAR_TEMP_NAME);
    }

    @DisplayName("자동차 MOVE 기능 테스트(4이상일 경우 움직인 거리 증가)")
    @Test
    void moveTest() {
        car.move(3);
        assertThat(car.getDistance()).isEqualTo(0);
        car.move(4);
        assertThat(car.getDistance()).isEqualTo(1);
        car.move(2);
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
