package Items;

import playable.Playable;

public class Piano extends MusicalInstrument implements Playable {

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


    public String play() {
        return "plink plonk goes the piano";
    }
}
