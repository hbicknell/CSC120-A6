import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//YOU ARE LEAVING EVERYTHING BUGGY YOU ARE JUST WRITING THE TESTS, SO WRITE TESTS FOR EVERY FUNCITON
public class ShopTest {
    ResaleShop test_shop;
    Computer test_comp;
    Computer non_comp;
    // add your tests here 
    
    @Before
    public void setup() {
        test_shop = new ResaleShop();
        test_comp = new Computer("Model", "Processor", 256, 23, "OS", 2012, 500);
        non_comp = new Computer("Hello", "Core", 2300, 23, "Sierra Mist", 2023, 2323);
}

    @Test
    public void testComputerConstructor() {
        assertEquals("Model", test_comp.description);
        assertEquals("Processor", test_comp.processorType);
        assertEquals(256, test_comp.hardDriveCapacity);
        assertEquals(23, test_comp.memory);
        assertEquals("OS", test_comp.operatingSystem);
        assertEquals(2015, test_comp.yearMade);
        assertEquals(500, test_comp.price);
    }
    @Test
    public void testSetOS() { 
        test_comp.setOS("newOS");
        assertEquals("newOS", test_comp.operatingSystem);
    }
 
    @Test
    public void testBuyComputerBuysCorrectComputer() {
        test_shop.buy(test_comp);
        assertTrue(test_shop.inventory.contains(test_comp));
}

    @Test
    public void testBuyComputerDoesNotDuplicate() {
        int originalSize = test_shop.inventory.size();
    
        test_shop.buy(test_comp);
    
        assertEquals(originalSize + 1, test_shop.inventory.size());    

        test_shop.buy(test_comp);
        assertEquals(originalSize + 1, test_shop.inventory.size());  
}

    @Test
    public void testPrintInventoryOnNotEmpty() {
        assertFalse(test_shop.inventory.isEmpty());
        test_shop.printInventory();
}

    @Test
    public void testSellThrowsException() {
        assertThrows(RuntimeException.class, () -> {
            test_shop.sell(non_comp); 
        });
    }

    @Test
    public void testRefurbishUpdatesOSCorrectly() {
        test_shop.inventory.add(test_comp);
        test_shop.refurbish(test_comp, "Hello");
        
        assertTrue(test_comp.price < 2500);
        assertEquals("Hello", test_comp.operatingSystem);
    }

    @Test
    public void testRefurbishDoesPriceCorrectly() {
        test_shop.inventory.add(test_comp);
        test_shop.refurbish(test_comp, "Hello");
        
        assertTrue(test_comp.price < 550);
        assertEquals("Hello", test_comp.operatingSystem);

}

    @Test
    public void test_toString() {
    assertEquals("Model\nProcessor\n256\n23\nOS\n2012\n500", test_comp.toString());
}


}



