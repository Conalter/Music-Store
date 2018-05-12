import Items.DrumKit;
import Items.FamilyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumkit;

    @Before
    public void before(){
        drumkit = new DrumKit("Ludwig Centennial Zep Set", "High-quality shell pack from Ludwig.", 500.00, 1300.00, FamilyType.PERCUSSION, 10, 12);
    }

    @Test
    public void canGetSkins(){
        assertEquals(10, drumkit.getSkins());
    }

    @Test
    public void canGetSticks(){
        assertEquals(12, drumkit.getSticks());
    }
}
