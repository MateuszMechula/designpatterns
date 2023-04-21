package pl.designpatterns.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton intance;

    private LazyInitializationSingleton() {
        System.out.println("Calling constructor from LazyInitializationSingleton");
    }

    public static LazyInitializationSingleton getIntance() {
        if (intance == null) {
            intance = new LazyInitializationSingleton();
        }
        return intance;
    }

    public static void someStaticMethod() {
        System.out.println("Calling someStaticMethod from LazyInitializationSingleton");
    }
}
