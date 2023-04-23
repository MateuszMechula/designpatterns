package pl.designpatterns.creational.factory;

public class HawaiianPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Preparing Hawaiian Pizza");
    }
}
