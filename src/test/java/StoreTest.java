import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    Store store;

    @Before
    public void before(){
        store = new Store("Music Store");
    }

    @Test
    public void getStoreName(){
        assertEquals("Music Store", store.getName());
    }

    @Test
    public void hasEmptyStock(){
        assertEquals(0, store.stockCount());
    }
}
