package items.musical_instruments;

import items.Item;

public abstract class MusicalInstrument extends Item {

//    public FamilyType family;

    public MusicalInstrument(String name, String description, double cost, double retail, FamilyType family) {
        super(name, description, cost, retail);
    }

//    public FamilyType getFamily() {
//        return family;
//    }

}
