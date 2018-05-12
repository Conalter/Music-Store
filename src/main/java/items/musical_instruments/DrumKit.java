package items.musical_instruments;

import items.Material;
import playable.Playable;

public class DrumKit extends MusicalInstrument implements Playable{

    private int skins;
    private int sticks;
    private FamilyType family;
    private Material material;

    public DrumKit(String name, String description, double cost, double retail, FamilyType family, int skins, int sticks, Material material) {
        super(name, description, cost, retail, family);
        this.skins = skins;
        this.sticks = sticks;
        this.family = family;
        this.material = material;
    }

    public int getSkins() {
        return skins;
    }

    public int getSticks() {
        return sticks;
    }

    public FamilyType getFamily(){
        return this.family;
    }

    public String play(){
        return "bish bash goes the drums";
    }

    public Material getMaterial(){
        return this.material;
    }
}
