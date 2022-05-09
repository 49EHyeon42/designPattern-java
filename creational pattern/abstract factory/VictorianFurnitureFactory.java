public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public VictorianChair createChair() {
        System.out.println("create victorian chair");
        return new VictorianChair();
    }

    @Override
    public VictorianCoffeeTable createCoffeeTable() {
        System.out.println("create victorian coffee table");
        return new VictorianCoffeeTable();
    }

    @Override
    public VictorianSofa createSofa() {
        System.out.println("create victorian sofa");
        return new VictorianSofa();
    }
}
