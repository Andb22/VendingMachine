import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
  //      customer = new Customer("Bob");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", customer.getName());
    }
}