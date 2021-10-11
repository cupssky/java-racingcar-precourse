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

    public static boolean isNumber(String value) {
        if (isBlank(value)) {
            return false;
        }
        if (!value.matches("[0-9]+")) {
            return false;
        }
        return true;
    }
}
