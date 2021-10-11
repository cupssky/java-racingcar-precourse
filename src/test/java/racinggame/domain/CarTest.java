package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final String CAR_TEMP_NAME = "GV60";
    private static final int TEST_MOVE_NUMBER = 5;
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

    @DisplayName("목표거리 지나가지 않은 자동차 정보 못가져오는지 기능 테스트 (결과 null)")
    @ValueSource(ints = 4)
    @ParameterizedTest
    void getDistanceOverCarsIsNullTest(int distance) {
        assertThat(car.getDistanceOverCar(distance)).isNull();
    }

    @DisplayName("목표거리 지나간 자동차인지 검증 기능 테스트 (움직인 차가 아니라서 결과 false)")
    @ValueSource(ints = 4)
    @ParameterizedTest
    void isDistanceOverCarsTest(int distance) {
        assertThat(car.isDistanceOverCar(distance)).isFalse();
    }

    @DisplayName("목표거리 지나간 자동차 정보 가져오는지 기능 테스트")
    @ValueSource(ints = 4)
    @ParameterizedTest
    void getDistanceOverCarsTest(int distance) {
        getTestMoveCar(6);
        assertThat(car.getDistanceOverCar(distance)).isNotNull();
    }

    void getTestMoveCar(int moveCount) {
        for (int i = 1; i <= moveCount; i++) {
            car.move(TEST_MOVE_NUMBER);
        }
    }
}
