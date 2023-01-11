package web.dao;

import web.model.Car;

import java.util.ArrayList;

public class CarDaoImpl implements CarDao {
    public static final ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lada", "White", 1));
        cars.add(new Car("Mazda", "Red", 2));
        cars.add(new Car("Toyota", "Pink", 3));
        cars.add(new Car("Audi", "Blue", 4));
        cars.add(new Car("BMW", "Black", 5));
    }
}
