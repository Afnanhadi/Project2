public class Route {
    private String address;
    private String destinationAddress;
    private double price;

    public Route(String address, String destinationAddress, double price) {
        this.address = address;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
