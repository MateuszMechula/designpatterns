package pl.designpatterns.creational.factory;

public class PepperoniPizza implements Pizza{
    @Override
    public void preparePizza() {
        System.out.println("Preparing pepperoni Pizza");
    }
}
