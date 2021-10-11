package racinggame.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertUtilTest {

    private static final String TEST_CAR_NAMES = "제네시스,K5";

    @DisplayName("입력값 자동차들로 변환 테스트(공백이나 비정상 값이면 null)")
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\n", "테스트"})
    @ParameterizedTest
    void convertCarsNotNullTest(String input) {
        assertThat(ConvertUtil.convertCars(input)).isNull();
    }

    @DisplayName("입력값 자동차들로 변환 테스트(정상 값이면 Cars)")
    @Test
    void convertCarsIsNullTest() {
        assertThat(ConvertUtil.convertCars(TEST_CAR_NAMES)).isNotNull();
    }
}
