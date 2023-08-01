package java.agenzia.immobiliare;

public class House extends Property{
    private int rooms;
    private int bathrooms;
    public House(String code, String address, String postalCode, String city, int surface, int rooms, int bathrooms) {
        super(code, address, postalCode, city, surface);
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rooms: " + rooms + ", Bathrooms: " + bathrooms;
    }
}
