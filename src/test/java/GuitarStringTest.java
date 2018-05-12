import items.miscellaneous.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Dr Handmade", "Standard Strings", 0.50, 2.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Dr Handmade", guitarString.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Standard Strings", guitarString.getDescription());
    }

    @Test
    public void canGetCost(){
        assertEquals(0.50, guitarString.getCost(), 0.01);
    }

    @Test
    public void canGetRetail(){
        assertEquals(2.50, guitarString.getRetail(), 0.01);
    }
}
