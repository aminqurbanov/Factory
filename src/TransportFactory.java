public class TransportFactory {
    public Transport createTransport(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            default:
                throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
