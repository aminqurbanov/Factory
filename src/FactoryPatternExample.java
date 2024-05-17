public class FactoryPatternExample {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        Transport truck = transportFactory.createTransport("truck");
        truck.deliver();

        Transport ship = transportFactory.createTransport("ship");
        ship.deliver();
    }
}
