package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {

    private static Long CAR_ID = 0L;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_ID, "BMW", 11));
        cars.add(new Car(++CAR_ID, "Audi", 12));
        cars.add(new Car(++CAR_ID, "Lada", 13));
        cars.add(new Car(++CAR_ID, "Tesla", 14));
        cars.add(new Car(++CAR_ID, "Haval", 15));

    }


    @Override
    public List<Car> showCar(int count) {
        return cars.subList(0, count);
    }
}
