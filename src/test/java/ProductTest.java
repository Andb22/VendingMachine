import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void before(){
        product = new Product("Kitkat", "A5", 1.20);
    }

    @Test
    public void canGetCode(){
        assertEquals("A5", product.getCode());
    }

    @Test
    public void canGetName(){
        assertEquals("Kitkat", product.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.20, product.getPrice(), 0.01);
    }

}
