package racinggame.utils;

import racinggame.domain.Car;
import racinggame.domain.CarName;
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
        List<Car> list = new ArrayList<>();
        for (String carName : Arrays.asList(value.split(COMMA))) {
            list.add(new Car(new CarName(carName)));
        }
        return new Cars(list);
    }
}
