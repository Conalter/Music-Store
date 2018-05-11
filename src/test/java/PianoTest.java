import Items.Item;
import Items.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha Grand Piano", "Fully functional acoustic piano with a powerful high-quality digital sound engine, providing a vast range of sonic possibilities.", 10000.00, 24000.00, "Percussion", 88, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha Grand Piano", piano.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Fully functional acoustic piano with a powerful high-quality digital sound engine, providing a vast range of sonic possibilities.", piano.getDescription());
    }

    @Test
    public void canGetCost(){
        assertEquals(10000.00, piano.getCost(), 0.01);
    }

    @Test
    public void canGetRetail(){
        assertEquals(24000.00, piano.getRetail(), 0.01);
    }

    @Test
    public void canGetFamily(){
        assertEquals("Percussion", piano.getFamily());
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canGetNumberOfPeddles(){
        assertEquals(3, piano.getPeddles());
    }

    @Test
    public void canPlayPiano(){
        assertEquals("plink plonk goes the piano", piano.play());
    }

}
