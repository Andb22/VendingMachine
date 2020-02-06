import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    Coin coin1;
    Coin coin2;

    @Before
    public void before(){
        account = new Account();
        coin1 = new Coin(CoinType.TENPENCE);
        coin2 = new Coin(CoinType.FIFTYPENCE);
    }

    @Test
    public void addCoinToAccount(){
        account.addCoin(coin1);
        assertEquals(1, account.countCoins());
    }

    @Test
    public void removeCoinFromCoins(){
        account.addCoin(coin1);
        account.removeCoin(0);
        assertEquals(0, account.countCoins());
    }

    @Test
    public void canGetOverallValueOfCoins(){
        account.addCoin(coin1);
        account.addCoin(coin2);
        account.addCoin(coin2);
        assertEquals(1.10, account.getOverallValueOfCoins(), 0.00);
    }

    @Test
    public void getQuantity(){
        account.addCoin(coin1);
        account.addCoin(coin2);
        account.addCoin(coin2);
        HashMap <String, Integer> result = account.getCoinQuantity();
        assertEquals(1, (int)result.get("TENPENCE"));
        assertEquals(2,(int)result.get("FIFTYPENCE"));
    }

}
