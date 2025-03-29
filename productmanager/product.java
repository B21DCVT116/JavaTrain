package productmanager;

public class product {
    private String idProduct;
    private String productName;
    private double price;
    private int quantity;

    public product(String idProduct, String productName, double price, int quantity) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
