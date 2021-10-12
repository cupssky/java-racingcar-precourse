package racinggame.command;

import nextstep.utils.Console;
import racinggame.domain.Cars;
import racinggame.error.BaseException;
import racinggame.error.ErrorType;
import racinggame.utils.ValidateUtil;

import static racinggame.utils.ConvertUtil.convertCars;
import static racinggame.view.GameView.printCommendGuide;

public class GameCommand {

    public Cars startCarNameCommand() {
        try {
            printCommendGuide(CommandType.CARNAME);
            return inputCarNameCommand();
        } catch (BaseException e) {
            return startCarNameCommand();
        }
    }

    public int startCarMoveCountCommand() {
        try {
            printCommendGuide(CommandType.MOVECOUNT);
            return inputCarMoveCountCommand();
        } catch (BaseException e) {
            return startCarMoveCountCommand();
        }
    }

    private Cars inputCarNameCommand() {
        String value = Console.readLine();
        if (!ValidateUtil.isSplit(value)) {
            throw new BaseException(ErrorType.NOT_VALID_CAR_NAME_COMMA);
        }
        return convertCars(value);
    }

    private int inputCarMoveCountCommand() {
        String value = Console.readLine();
        if (!ValidateUtil.isNumber(value)) {
            throw new BaseException(ErrorType.NOT_NUMBER);
        }
        return Integer.valueOf(value);
    }
}
