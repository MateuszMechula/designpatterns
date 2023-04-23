package pl.designpatterns.creational.abstractFactory.car;

public class Suv implements Car {
    @Override
    public void create() {
        System.out.println("Creating Suv");
    }
}
