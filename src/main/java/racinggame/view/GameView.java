package racinggame.view;

import racinggame.command.CommandType;
import racinggame.error.ErrorType;

public class GameView {

    public static void printError(ErrorType errorType) {
        System.out.println(errorType.getMessage());
    }

    public static void printCommendGuide(CommandType commandType) {
        System.out.println(commandType.getGuide());
    }
}
