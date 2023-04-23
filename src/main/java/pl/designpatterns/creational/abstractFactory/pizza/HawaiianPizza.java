package pl.designpatterns.creational.abstractFactory.pizza;

public class HawaiianPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Preparing Hawaiian Pizza");
    }
}
