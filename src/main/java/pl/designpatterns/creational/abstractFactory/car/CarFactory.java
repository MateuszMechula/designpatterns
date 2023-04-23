package pl.designpatterns.creational.abstractFactory.car;

import pl.designpatterns.creational.abstractFactory.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarFactory implements AbstractFactory<Car> {

    private static final Map<String, Supplier<Car>> CAR_MAP = new HashMap<>();

    static {
        CAR_MAP.put("Suv", Suv::new);
        CAR_MAP.put("Sedan", Sedan::new);
    }

    @Override
    public Car create(String type) {
        return Optional.ofNullable(CAR_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Car type: [%s] doesn't exists", type)));
    }
}
