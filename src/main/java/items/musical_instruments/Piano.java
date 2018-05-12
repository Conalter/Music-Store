package items.musical_instruments;

import items.Material;
import playable.Playable;

public class Piano extends MusicalInstrument implements Playable {

    private int keys;
    private int peddles;
    private FamilyType family;
    private Material material;

    public Piano(String name, String description, double cost, double retail, FamilyType family, int keys, int peddles, Material material) {
        super(name, description, cost, retail, family);
        this.keys = keys;
        this.peddles = peddles;
        this.family = family;
        this.material = material;
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

    public FamilyType getFamily() {
        return this.family;
    }

    public Material getMaterial(){
        return this.material;
    }
}
