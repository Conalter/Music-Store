import items.Material;
import items.miscellaneous.SheetMusic;
import items.musical_instruments.FamilyType;
import items.musical_instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    Store store;
    Piano piano;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        store = new Store("Music Store");
        piano = new Piano("Yamaha PortaSound", "Small Portable Keyboard", 25.00, 32.00, FamilyType.PERCUSSION, 22, 0, Material.PLASTIC);
        sheetMusic = new SheetMusic("Guero", "Guero Sheet Music", 10.00, 18.00);
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

    @Test
    public void canRemoveStock(){
        store.addStock(piano);
        store.addStock(sheetMusic);
        store.removeStock(piano);
        assertEquals(1, store.stockCount());
    }

    @Test
    public void canCalculateProfit(){
        store.addStock(piano);
        store.addStock(piano);
        assertEquals(14, store.calculateProfit(), 0.01);
    }

    @Test
    public void canSellItem(){
        store.addStock(sheetMusic);
        store.addStock(sheetMusic);
        store.sellItem(sheetMusic);
        assertEquals(1, store.stockCount());
        assertEquals(1, store.soldCount());
    }
}
