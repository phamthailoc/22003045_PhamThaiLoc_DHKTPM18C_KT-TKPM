package factory_pattern;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Truck");
    }

}