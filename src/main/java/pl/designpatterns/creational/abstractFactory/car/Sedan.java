package pl.designpatterns.creational.abstractFactory.car;

public class Sedan implements Car {

    @Override
    public void create() {
        System.out.println("Creating sedan");
    }
}
