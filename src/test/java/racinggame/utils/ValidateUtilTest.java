package racinggame.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidateUtilTest {

    @DisplayName("입력값 공백검증 테스트(공백이면 True)")
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\n"})
    @ParameterizedTest
    void isBlankTrueTest(String input) {
        assertThat(ValidateUtil.isBlank(input)).isTrue();
    }

    @DisplayName("입력값 공백검증 테스트(값이 존재하는 False)")
    @ValueSource(strings = {"테스트", "cupssky"})
    @ParameterizedTest
    void isBlankFalseTest(String input) {
        assertThat(ValidateUtil.isBlank(input)).isFalse();
    }

    @DisplayName("입력값 콤마 SPLIT여부 테스트(SPLIT 가능한 경우 true)")
    @ValueSource(strings = {"테스트,테스트", "테스트,abcd", "1234,테스트"})
    @ParameterizedTest
    void isSplitTrueTest(String input) {
        assertThat(ValidateUtil.isSplit(input)).isTrue();
    }

    @DisplayName("입력값 콤마 SPLIT여부 테스트(SPLIT 불가능한 경우 false)")
    @ValueSource(strings = {"테스트", " ", "\n", ",,", "a,"})
    @NullAndEmptySource
    @ParameterizedTest
    void isSplitFalseTest(String input) {
        assertThat(ValidateUtil.isSplit(input)).isFalse();
    }

    @DisplayName("입력값 숫자값 여부 테스트(숫자값인 경우 true)")
    @ValueSource(strings = {"1", "55", "12"})
    @ParameterizedTest
    void isNumberTrueTest(String input) {
        assertThat(ValidateUtil.isNumber(input)).isTrue();
    }

    @DisplayName("입력값 숫자값 여부 테스트(숫자값인 아닌경우 false")
    @ValueSource(strings = {"김", "abcd", "12김"})
    @NullAndEmptySource
    @ParameterizedTest
    void isNumberFalseTest(String input) {
        assertThat(ValidateUtil.isNumber(input)).isFalse();
    }
}
