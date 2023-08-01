package java.agenzia.immobiliare;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private List<Property> properties;
    public Agency(){
        properties = new ArrayList<>();
    }

    public void addProperty( Property property) {
    properties.add(property);
    }
    public Property findPropertyByCode(String code){
        for (Property property: properties){
            if (property.getCode().equals(code)){
                return property;
            }
        }
        return null;
    }
    public Property getPropertyInterest(){
        Property mostInteresetedProperty = null;
        int maxInterestedPeople = 0;
        for (Property property : properties){
            if (property.getInterestedPeople() > maxInterestedPeople){
                maxInterestedPeople = property.getInterestedPeople();
                mostInteresetedProperty = property;
            }
        }
        return mostInteresetedProperty;
    }
}
