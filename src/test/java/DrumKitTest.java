import items.musical_instruments.DrumKit;
import items.musical_instruments.FamilyType;
import items.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumkit;
    Material material;


    @Before
    public void before(){
        drumkit = new DrumKit("Ludwig Centennial Zep Set", "High-quality shell pack from Ludwig.", 500.00, 1300.00, FamilyType.PERCUSSION, 10, 12, Material.PLASTIC);
    }

    @Test
    public void canGetSkins(){
        assertEquals(10, drumkit.getSkins());
    }

    @Test
    public void canGetSticks(){
        assertEquals(12, drumkit.getSticks());
    }

    @Test
    public void canGetFamily(){
        assertEquals(FamilyType.PERCUSSION, drumkit.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.PLASTIC, drumkit.getMaterial());
    }
}
