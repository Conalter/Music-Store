import items.Material;
import items.musical_instruments.FamilyType;
import items.musical_instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    Store store;
    Piano piano;

    @Before
    public void before(){
        store = new Store("Music Store");
        piano = new Piano("Yamaha PortaSound", "Small Portable Keyboard", 25.00, 32.00, FamilyType.PERCUSSION, 22, 0, Material.PLASTIC);
    }

    @Test
    public void getStoreName(){
        assertEquals("Music Store", store.getName());
    }

    @Test
    public void hasEmptyStock(){
        assertEquals(0, store.stockCount());
    }

    @Test
    public void canAddItemToStock(){
        store.addStock(piano);
        assertEquals(1, store.stockCount());

    }
}
