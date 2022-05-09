// https://refactoring.guru/design-patterns/abstract-factory#:~:text=Abstract%20Factory%20is%20a%20creational,without%20specifying%20their%20concrete%20classes.

public class Main {

    public static void main(String[] args) {
        Application application;
        FurnitureFactory furnitureFactory;

        // example victorian factory
        furnitureFactory = new VictorianFurnitureFactory();
        application = new Application(furnitureFactory);
        application.hasLegs();

        // example modern factory
        furnitureFactory = new ModernFurnitureFactory();
        application = new Application(furnitureFactory);
        application.coffeeTableTestMethod1();
    }
}
