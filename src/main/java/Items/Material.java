package Items;

public enum Material {

    WOOD("wood"),
    BRASS("brass"),
    STEEL("steel"),
    PLASTIC("plastic"),
    FORMICA("formica"),
    COPPER("copper");

    private String material;

    Material(String material){
       this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}
