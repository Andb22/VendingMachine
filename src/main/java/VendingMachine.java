import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> inventory;
    private Account vmFloat;
    private Account transaction;

    public VendingMachine() {
        this.inventory = new ArrayList<Product>();
        this.transaction = new Account();
        this.vmFloat = new Account();
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public Account getVmFloat() {
        return vmFloat;
    }

    public void addProduct(Product product){
        this.inventory.add(product);
    }

    public boolean isProductAvailable(Product soughtProduct) {
        for (Product product : this.inventory) {
            if (product.getName() == soughtProduct.getName()) ;
        }
        return false;
    }


    public void sellProduct(Customer customer, Product soughtProduct) {
      if (this.isProductAvailable(soughtProduct));
                customer.addProduct(soughtProduct);
                this.inventory.remove(soughtProduct);
            }

    public void entersCoin(Customer customer, int index) {
        Coin coin = customer.removeCoinWallet(index);
        transaction.addCoin(coin);
    }

    public double getTransactionTotal() {
        return this.transaction.getOverallValueOfCoins();
    }

    public double getProductPrice(Product product) {
        return product.getPrice();
    }

    public boolean hasEnoughMoneyBeenEntered(Product product) {
        System.out.println(getTransactionTotal());
        System.out.println(product.getPrice());
        if(getTransactionTotal() >= product.getPrice()){
            return true;
        }
        return false;
    }

    public double getFloatTotal() {
        return this.vmFloat.getOverallValueOfCoins();
    }

    public void moveTransFloat() {
        for(Coin coin : this.transaction.getCoins()){
            this.vmFloat.addCoin(coin);
        }
        this.transaction.clear();
    }
}

