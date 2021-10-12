package racinggame.domain;

import racinggame.error.BaseException;
import racinggame.error.ErrorType;

import static racinggame.utils.ValidateUtil.isValidLength;

public class CarName {

    private String carName;

    public CarName(String carName) {
        if (!isValidLength(carName, 5)) {
            throw new BaseException(ErrorType.NOT_VALID_CAR_NAME);
        }
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
