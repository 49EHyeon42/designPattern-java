public class Application {

    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public Application(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        coffeeTable = furnitureFactory.createCoffeeTable();
        sofa = furnitureFactory.createSofa();
    }

    // some operation...
    public void hasLegs() {
        chair.hasLegs();
    }

    public void coffeeTableTestMethod1() {
        coffeeTable.testMethod1();
    }
}
