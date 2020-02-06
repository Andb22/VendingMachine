import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendie;
    Account account;
    Product product;
    Customer customer;
    Account wallet;
    Account transaction;
    Coin coin1;
    Coin coin2;


    @Before
    public void before(){
        account = new Account();
        transaction = new Account();
        vendie = new VendingMachine();
        product = new Product("Kitkat", "A5", 1.20);
        wallet = new Account();
        customer = new Customer("Billy", wallet);
        coin1 = new Coin(CoinType.TENPENCE);
        coin2 = new Coin(CoinType.FIFTYPENCE);
    }

    @Test
    public void canGetInventorySize(){
        vendie.addProduct(product);
        assertEquals(1, vendie.getInventory().size());
    }

    @Test
    public void canSellProduct(){
        vendie.addProduct(product);
        vendie.addProduct(product);
        vendie.sellProduct(customer, product);
        assertEquals(1, customer.getPocket().size());
        assertEquals(1, vendie.getInventory().size());
    }

    @Test
    public void canMoveMoney(){
        //just adds coin to customers wallet
        customer.addCoin(coin1);
        vendie.entersCoin(customer, 0);
        assertEquals(0.1, vendie.getTransactionTotal(), 0.01);

    }

    @Test
    public void canGetPriceOfChoosenProduct(){
        assertEquals(1.2, vendie.getProductPrice(product), 0.01);
    }



    @Test
    public void canCheckTransactionAgainstPrice(){
        customer.addCoin(coin1);
        customer.addCoin(coin1);
        customer.addCoin(coin2);
        customer.addCoin(coin2);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        assertEquals(true, vendie.hasEnoughMoneyBeenEntered(product));
    }

    @Test
    public void canMoveMoneyFromTransToFloat(){
        customer.addCoin(coin1);
        customer.addCoin(coin1);
        customer.addCoin(coin2);
        customer.addCoin(coin2);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        vendie.entersCoin(customer, 0);
        vendie.moveTransFloat();
        assertEquals(0, vendie.getTransactionTotal(), 0.01);
        assertEquals(1.2, vendie.getFloatTotal(), 0.01);
    }

}


