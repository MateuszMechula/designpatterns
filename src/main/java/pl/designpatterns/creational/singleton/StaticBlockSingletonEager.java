package pl.designpatterns.creational.singleton;

public final class StaticBlockSingletonEager {

    private static final StaticBlockSingletonEager instance;

    static {
        System.out.println("Calling static block from StaticBlockSingletonEager");
        try {
            instance = new StaticBlockSingletonEager();
        } catch (Exception e) {
            throw new RuntimeException("Exception thrown while creating instance");
        }
    }

    private StaticBlockSingletonEager() {
        System.out.println("Calling constructor from StaticBlockSingletonEager");
    }

    public static StaticBlockSingletonEager getInstance() {
        return instance;
    }

    public static void someStaticMethod() {
        System.out.println("Calling someStaticMethod from StaticBlockSingletonEager");
    }


}
