import java.util.ArrayList;
import java.util.HashMap;

public class Account {

    private ArrayList<Coin> coins;

    public Account() {
        this.coins = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public int countCoins(){
       return this.coins.size();
    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

    public void removeCoin(int index){
        this.coins.remove(index);
    }


    public double getOverallValueOfCoins() {
        double value = 0;
        for(Coin coin : coins){
            value +=coin.getCoinValue();
        }
        return value;
    }

    public HashMap<String , Integer> getCoinQuantity(){
            HashMap<String , Integer> listOfCoins = new HashMap<String, Integer>();
            for(CoinType cointype : CoinType.values()) {
                int count = 0;
                for (Coin coin : this.coins) {

                    if (coin.getCoin().name() == cointype.name()) {
                        count += 1;
                    }

                }
                listOfCoins.put(cointype.name(), count);
            }
            return listOfCoins;
    }
}
