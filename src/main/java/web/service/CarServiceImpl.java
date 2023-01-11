package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carDao.cars;
        } else {
            return carDao.cars.stream().limit(count).collect(Collectors.toCollection(ArrayList::new));
        }
    }
}
