package pl.designpatterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {

        final AbstractFactory<?> carFactory = FactoryProvider.createFactory("CarFactory");
        System.out.println(carFactory);
        final Object suv = carFactory.create("Suv");
        System.out.println(suv);

        final AbstractFactory<?> pizzaFactory = FactoryProvider.createFactory("PizzaFactory");
        System.out.println(pizzaFactory);
        final Object hawaiian = pizzaFactory.create("Hawaiian");
        System.out.println(hawaiian);
    }
}
