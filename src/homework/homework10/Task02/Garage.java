package homework.homework10.Task02;

import homework.homework10.Task02.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> carInGarageMap = new HashMap<>();

    public void parking(Car car) {
        if (carInGarageMap.containsKey(car)) {
            carInGarageMap.put(car, carInGarageMap.get(car) + 1);
        } else {
            carInGarageMap.put(car, 1);
        }
    }

    public boolean exitCar(Car car) {
        if (carInGarageMap.containsKey(car) && carInGarageMap.get(car) >= 1) {
            carInGarageMap.put(car, carInGarageMap.get(car) - 1);
            return true;
        } else {
            return false;
        }
    }

    public int numberOfTypeAutoInGarage(Car car) {
        int number = 0;
        for (Map.Entry<Car, Integer> entry : carInGarageMap.entrySet()) {
            if (car.getClass().equals(entry.getKey().getClass())) {
                number += entry.getValue();
            }
        }
        return number;
    }
}
