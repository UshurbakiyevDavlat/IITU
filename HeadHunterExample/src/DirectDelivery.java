public class DirectDelivery extends DeliverySystem{
    private String city;
    private String streetName;
    private  int houseNumber;
    private int flatNumber;

    public DirectDelivery(String city, String streetName, int houseNumber, int flatNumber) {
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "DirectDelivery{" +
                "city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
