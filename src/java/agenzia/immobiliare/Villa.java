package java.agenzia.immobiliare;

public class Villa extends House{
    private int gardenSurface
    public Villa(String code, String address, String postalCode, String city, int surface, int rooms, int bathrooms, int gardenSurface) {
        super(code, address, postalCode, city, surface, rooms, bathrooms);
        this.gardenSurface = gardenSurface;
    }

    @Override
    public void resetSurface(int newSurface) {
        super.resetSurface(newSurface);
    }

    @Override
    public String toString() {
        return super.toString() + ", Garden Surface: " + gardenSurface;
    }
}
