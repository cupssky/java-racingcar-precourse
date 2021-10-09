package racinggame.utils;

public class ValidateUtil {

  public static boolean isBlank(String value) {
    return value == null || value.trim().isEmpty();
  }
}
