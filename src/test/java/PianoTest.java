import Items.Item;
import Items.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha Grand Piano", "Fully functional acoustic piano with a powerful high-quality digital sound engine, providing a vast range of sonic possibilities.", 10000.00, 24000.00, "Percussion");
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha Grand Piano", piano.getName());
    }
}
