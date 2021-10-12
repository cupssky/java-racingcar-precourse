package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.error.BaseException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @DisplayName("이름이 5자리 초과일 경우 BaseException 발생 테스트")
    @ValueSource(strings = {"TEST1234", "abcd123", "abcdef"})
    @ParameterizedTest
    void carNameLengthTest(String input) {
        assertThatThrownBy(() ->
            new CarName(input)
        ).isInstanceOf(BaseException.class);
    }
}
