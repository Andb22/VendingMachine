import java.util.ArrayList;

public class Customer {

    private String name;
    private Account wallet;
    ArrayList<Products> pocket;

    public Customer(String name) {
        this.name = name;
        this.wallet = wallet;
        this.pocket = new ArrayList<Products>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getWallet() {
        return wallet;
    }

    public ArrayList<Products> getPocket() {
        return pocket;
    }

    public void setPocket(ArrayList<Products> pocket) {
        this.pocket = pocket;
    }
}
