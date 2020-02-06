public class Product {

    private String name;
    private String code;
    private double price;

    public Product(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }


}
