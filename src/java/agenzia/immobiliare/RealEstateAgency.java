package java.agenzia.immobiliare;

public class RealEstateAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();

        Box box = new Box("BOX123","Milano St.","20123","Milano","15", "1");
        House house = new House("HOUS302", "Isola Ave.", " 20412", " Milano", "90", "3", "2");
        Villa villa = new Villa("V1LL4", "Garibald Sub", "20231", " Milano", "150", "5", "3", "200");

        agency.addProperty(box);
        agency.addProperty(house);
        agency.addProperty(villa);

        box.addInterestedPeople();
        box.addInterestedPeople();
        house.addInterestedPeople();
        house.addInterestedPeople();
        house.addInterestedPeople();
        villa.addInterestedPeople();
        villa.addInterestedPeople();
        villa.addInterestedPeople();
        villa.addInterestedPeople();

        Property propertyFound = agency.findPropertyByCode("VILLA001");
        if (propertyFound != null) {
            System.out.println("Property found: " + propertyFound);
        } else {
            System.out.println("Property not found.");
        }

        Property mostInterestedProperty = agency.getPropertyInterest();
        if (mostInterestedProperty != null) {
            System.out.println("Property with most interested people: " + mostInterestedProperty);
        } else {
            System.out.println("No property found.");
        }
    }
}
