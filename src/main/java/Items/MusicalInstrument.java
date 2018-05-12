package Items;

public abstract class MusicalInstrument extends Item {

    private FamilyType family;

    public MusicalInstrument(String name, String description, double cost, double retail, FamilyType family) {
        super(name, description, cost, retail);
    }

    public FamilyType getFamily() {
        return family;
    }

}
