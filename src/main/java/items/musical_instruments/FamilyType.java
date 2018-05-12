package items.musical_instruments;

public enum FamilyType {

    PERCUSSION("percussion"),
    STRING("string"),
    WOODWIND("woodind"),
    BRASS("brass");

    private String family;

    FamilyType(String family){
        this.family = family;
    }

    public String getFamily() {
        return this.family;
    }
}
