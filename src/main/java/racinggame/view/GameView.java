package racinggame.view;

import racinggame.command.CommandType;

public class GameView {
    public static void printCommendGuide(CommandType commandType) {
        System.out.println(commandType.getGuide());
    }
}
