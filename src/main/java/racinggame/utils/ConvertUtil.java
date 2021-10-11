package racinggame.utils;

import racinggame.domain.Car;
import racinggame.domain.Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static racinggame.utils.ValidateUtil.isSplit;

public class ConvertUtil {

    private static String COMMA = ",";

    public static Cars convertCars(String value) {
        if (!isSplit(value)) {
            return null;
        }
        List<String> carNames = Arrays.asList(value.split(COMMA));
        List<Car> list = new ArrayList<>();
        for (String carName : carNames) {
            list.add(new Car(carName));
        }
        return new Cars(list);
    }
}
