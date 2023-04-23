package pl.designpatterns.creational.abstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
