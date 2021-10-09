package racinggame.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
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
  @ValueSource(strings = {"테스트", " ", "\n"})
  @NullAndEmptySource
  @ParameterizedTest
  void isSplitTrueFalse(String input) {
    assertThat(ValidateUtil.isSplit(input)).isFalse();
  }
}
