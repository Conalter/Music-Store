package Items;

public class Piano extends MusicalInstrument{

    private int keys;
    private int peddles;

    public Piano(String name, String description, double cost, double retail, String family, int keys, int peddles) {
        super(name, description, cost, retail, family);
        this.keys = keys;
        this.peddles = peddles;
    }

    public int getKeys() {
        return keys;
    }

    public int getPeddles() {
        return peddles;
    }
}
