public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public ModernChair createChair() {
        System.out.println("create modern chair");
        return new ModernChair();
    }

    @Override
    public ModernCoffeeTable createCoffeeTable() {
        System.out.println("create modern coffee table");
        return new ModernCoffeeTable();
    }

    @Override
    public ModernSofa createSofa() {
        System.out.println("create modern sofa");
        return new ModernSofa();
    }
}
