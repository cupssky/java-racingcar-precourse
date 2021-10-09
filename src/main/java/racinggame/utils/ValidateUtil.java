package racinggame.utils;

public class ValidateUtil {

  private static String COMMA = ",";

  public static boolean isBlank(String value) {
    return value == null || value.trim().isEmpty();
  }

  public static boolean isSplit(String value) {
    if(isBlank(value)) {
      return false;
    }
    return value.split(COMMA).length > 1;
  }
}
