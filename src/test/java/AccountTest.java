import org.junit.Before;
import org.junit.Test;

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
}
