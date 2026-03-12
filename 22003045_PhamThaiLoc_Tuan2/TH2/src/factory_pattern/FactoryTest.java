package factory_pattern;

public class FactoryTest {

    public static void main(String[] args) {

        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();

    }

}