package racinggame.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidateUtilTest {

  @DisplayName("입력값 공백검증 테스트(공백이면 true)")
  @NullAndEmptySource
  @ValueSource(strings = {" ", "\n"})
  @ParameterizedTest
  void 입력값_공백검증_공백_테스트(String input) {
    assertThat(ValidateUtil.isBlank(input)).isTrue();
  }

  @DisplayName("입력값 공백검증 테스트(값이 있는경우 true)")
  @ValueSource(strings = "테스트")
  @ParameterizedTest
  void 입력값_공백검증_입력값존재_테스트(String input) {
    assertThat(ValidateUtil.isBlank(input)).isFalse();
  }
}
