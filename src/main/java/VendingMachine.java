import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> inventory;
    private Account vmFloat;

    public VendingMachine(Account vmFloat) {
        this.inventory = new ArrayList<Product>();
        this.vmFloat = vmFloat;
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


    public void getProduct(Customer customer, Product soughtProduct) {
      if (this.isProductAvailable(soughtProduct));
                customer.addProduct(soughtProduct);
                this.inventory.remove(soughtProduct);
            }
        }

