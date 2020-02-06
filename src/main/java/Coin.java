public class Coin {

    private CoinType coin;

    public Coin(CoinType coin) {
        this.coin = coin;
    }

    public CoinType getCoin() {
        return coin;
    }

    public double getCoinValue(){
        return this.coin.getValue();
    }
}
