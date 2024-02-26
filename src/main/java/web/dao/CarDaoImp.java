package web.dao;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add();
        cars.add();
        cars.add();
        cars.add();
        cars.add();
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
