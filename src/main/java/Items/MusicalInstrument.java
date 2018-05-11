package Items;

public abstract class MusicalInstrument extends Item {

    private String family;

    public MusicalInstrument(String name, String description, double cost, double retail, String family) {
        super(name, description, cost, retail);
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
