package pl.designpatterns.creational.abstractFactory.pizza;


public class PepperoniPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Preparing pepperoni Pizza");
    }
}
