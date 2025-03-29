import java.util.HashMap;

class exceptionProductNotFound extends Exception {
  public exceptionProductNotFound(String message) {
    super(message);
  }
}

class product{
  private String nameProduct;
  private int stock;
  private double price;
  
  public product(String nameProduct, int stock, double price) {
    this.nameProduct = nameProduct;
    this.stock = stock;
    this.price = price;
  }
  public String getNameProduct() {
    return nameProduct;
  }
  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }
  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
}

class Warehouse {
  HashMap <Integer, product> warehouse = new HashMap <Integer, product> ();
  public void addProduct(product p) {
    warehouse.put(warehouse.size() + 1, p);
  }
  public void price (String nameProduct){
    if (warehouse.containsValue(nameProduct)){
      System.out.println(nameProduct + ": " + warehouse.get(nameProduct).getPrice());
    } else {
      exceptionProductNotFound e = new exceptionProductNotFound("-99");
    }
  }
}

public class COLLECTION001 {
  public static void main(String[] args) {
    Warehouse w = new Warehouse();
    product p1 = new product("milk", 10, 3);
    product p2 = new product("coffee", 5, 7);
    w.addProduct(p1);
    w.addProduct(p2);
    w.price("milk");
    w.price("coffee");
    w.price("sugar");
  }


}
