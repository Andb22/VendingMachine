import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendie;
    Account account;
    Product product;
    Customer customer;
    Account wallet;


    @Before
    public void before(){
        account = new Account();
        vendie = new VendingMachine(account);
        product = new Product("Kitkat", "A5", 1.20);
        wallet = new Account();
        customer = new Customer("Billy", wallet);
    }

    @Test
    public void canGetInventorySize(){
        vendie.addProduct(product);
        assertEquals(1, vendie.getInventory().size());
    }

    @Test
    public void canGetProduct(){
        vendie.addProduct(product);
        vendie.addProduct(product);
        vendie.getProduct(customer, product);
        assertEquals(1, customer.getPocket().size());
        assertEquals(1, vendie.getInventory().size());
    }
}
