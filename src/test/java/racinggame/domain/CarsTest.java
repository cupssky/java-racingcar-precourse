package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("GV60"));
        list.add(new Car("아반떼"));
        list.add(new Car("테슬라"));
        cars = new Cars(list);
    }

    @DisplayName("자동차들을 움직이게 하는 move 기능 테스트(distance가 0인경우가 없음, Max는 0보다 큼)")
    @Test
    void moveTest() {
        cars.move();
        assertThat(cars.getMaxDistance()).isNotZero();
    }

    @DisplayName("자동차들중 가장멀리간 자동차들 가져오는 기능 테스트(가장멀리간 자동차들을 리턴)")
    @Test
    void getMaxDistanceCarsTest() {
        cars.move();
        assertThat(cars.getMaxDistanceCars().size()).isGreaterThan(0);
    }

}
