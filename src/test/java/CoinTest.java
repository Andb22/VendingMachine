import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;


    @Before
    public void before(){
        coin = new Coin(CoinType.TENPENCE);
    }

    @Test
    public void canGetValue(){
        assertEquals(0.10, coin.getCoinValue(), 0.01);
    }


    @Test
    public void canGetType(){
        assertEquals(CoinType.TENPENCE, coin.getCoin());
    }

}
