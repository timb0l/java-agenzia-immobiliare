package java.agenzia.immobiliare;

public class Property {
    private String code;
    private String address;
    private String postalCode;
    private String city;
    private int surface;
    private int interestedPeople;

    public Property(String code, String address, String postalCode, String city, int surface){
        this.code = code;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.surface = surface;
        this.interestedPeople = 0;
    }
    public void addInterestedPeople() {
        interestedPeople ++;
    }
    public String getCode() {
        return code;
    }
    public int getInterestedPeople() {
        return interestedPeople;
    }

    public void resetSurface(int newSurface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Code: " + code +
                ", Adress: " + address +
                ", Postal Code: " + postalCode +
                ", City: " + city +
                ", Surface: " + surface +
                ", Interested People: " + interestedPeople;
    }
}
