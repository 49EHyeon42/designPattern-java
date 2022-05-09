public class VictorianChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("victorian chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("victorian chair sit on");
    }
}
