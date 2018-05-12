import Items.FamilyType;
import Items.Guitar;
import Items.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Material material;

    @Before
    public void before(){
        this.guitar = new Guitar("Cole Clark Fat Lady","This all-mahogany instrument, from Cole Clark’s Fat Lady series, is a deceptively modest guitar.", 1000, 1800, FamilyType.STRING, 6, 2, Material.STEEL);
    }

    @Test
    public void canGetStrings(){
        assertEquals(6, guitar.getString()) ;
    }

    @Test
    public void canGetPlectrum(){
        assertEquals(2, guitar.getPlectrum());
    }

    @Test
    public void canGetFamily(){
        assertEquals(FamilyType.STRING, guitar.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.STEEL, guitar.getMaterial());
    }
}
