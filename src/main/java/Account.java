import java.util.ArrayList;

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




}
