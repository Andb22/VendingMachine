import java.util.ArrayList;

public class Customer {

    private String name;
    private Account wallet;
    ArrayList<Product> pocket;

    public Customer(String name, Account wallet) {
        this.name = name;
        this.wallet = wallet;
        this.pocket = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public Account getWallet() {
        return wallet;
    }

    public ArrayList<Product> getPocket() {
        return pocket;
    }

    public void addProduct(Product product) {
        this.pocket.add(product);
    }

    public Coin removeCoinWallet(int index){
        return this.wallet.removeCoin(index);
    }

    public void addCoin(Coin coin) {
        this.wallet.addCoin(coin);
    }
}
