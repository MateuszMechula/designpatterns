package pl.designpatterns.creational.abstractFactory.pizza;

import pl.designpatterns.creational.abstractFactory.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory implements AbstractFactory<Pizza> {

    private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", PepperoniPizza::new);
        PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
    }

    @Override
    public Pizza create(String type) {
        return Optional.ofNullable(PIZZA_MAP.get(type))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Sorry we dont sell [%s]", type)));
    }
}
