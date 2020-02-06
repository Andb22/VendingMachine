import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Account account;
    Coin coin1;
    Coin coin2;


    @Before
    public void before(){
        account = new Account();
        customer = new Customer("Bob", account);
        coin1 = new Coin(CoinType.TENPENCE);
        coin2 = new Coin(CoinType.FIFTYPENCE);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void getQuantity(){
        account.addCoin(coin1);
        account.addCoin(coin2);
        account.addCoin(coin2);
        HashMap<String, Integer> result = account.getCoinQuantity();
        assertEquals(1, (int)result.get("TENPENCE"));
        assertEquals(2,(int)result.get("FIFTYPENCE"));
    }

    @Test
    public void canAddProduct(){
        Product product = new Product("crisps", "A12", 0.8);
        customer.addProduct(product);
        assertEquals(1, customer.getPocket().size());
    }
}
