package racinggame.error;

public enum ErrorType {

    NOT_VALID_CAR_NAME("[ERROR] 자동차이름은 1자이상 5자 이하여야 합니다."),
    NOT_VALID_CAR_NAME_COMMA("[ERROR] 자동차 이름을 쉼표 기준으로 구분하여 입력해주세요."),
    NOT_NUMBER("[ERROR] 올바른 숫자로 입력해주세요.");

    private String message;

    ErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
