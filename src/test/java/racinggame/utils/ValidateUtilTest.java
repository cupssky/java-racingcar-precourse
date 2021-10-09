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

}
