package racinggame.error;

import static racinggame.view.GameView.printError;

public class BaseException extends RuntimeException {

    public BaseException(ErrorType errorType) {
        super(errorType.getMessage());
        printError(errorType);
    }
}
