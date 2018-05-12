package items.musical_instruments;

import items.Material;
import playable.Playable;

public class Guitar extends MusicalInstrument implements Playable{

    private int string;
    private int plectrum;
    private FamilyType family;
    private Material material;

    public Guitar(String name, String description, double cost, double retail, FamilyType family, int string, int plectrum, Material material) {
        super(name, description, cost, retail, family);
        this.string = string;
        this.plectrum = plectrum;
        this.family = family;
        this.material = material;
    }

    public FamilyType getFamily() {
        return this.family;
    }

    public int getString() {
        return string;
    }

    public int getPlectrum() {
        return plectrum;
    }

    public String play(){
        return "twing twang the gutiar can play";
    }

    public Material getMaterial(){
        return this.material;
    }

}
