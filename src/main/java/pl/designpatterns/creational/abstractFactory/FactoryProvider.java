package pl.designpatterns.creational.abstractFactory;

import pl.designpatterns.creational.abstractFactory.car.CarFactory;
import pl.designpatterns.creational.abstractFactory.pizza.PizzaFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoryProvider {

    private static final Map<String, Supplier<AbstractFactory<?>>> FACTORY_MAP = new HashMap<>();

    static {
        FACTORY_MAP.put("CarFactory", CarFactory::new);
        FACTORY_MAP.put("PizzaFactory", PizzaFactory::new);
    }

    public static AbstractFactory<?> createFactory(String type) {
        return Optional.ofNullable(FACTORY_MAP.get(type)).stream()
                .map(Supplier::get)
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("Factory of type: [%s] doesn't exists",type)));
    }
}
