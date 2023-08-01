package java.agenzia.immobiliare;

public class Box extends Property {

    public Box(String code, String address, String postalCode, String city, int surface, int parking) {
        super(code, address, postalCode, city, surface);
        this.parking = parking;
    }

    @Override
    public String toString() {
        return super.toString() + ", Parking Spaces: " + parking;
    }
}
