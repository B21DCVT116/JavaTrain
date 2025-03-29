import java.util.HashMap;

class exceptionProductNotFound extends Exception {
  public exceptionProductNotFound(String message) {
    super(message);
  }
}

class product{
  private String nameProduct;
  private int stock;
  private int price;
  
  public product(String nameProduct, int stock, int price) {
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
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}

class Warehouse {
  HashMap <String, Integer> stock = new HashMap <String, Integer> ();
  HashMap <String, Integer> price = new HashMap <String, Integer> ();
  public void addProduct(product p) {
    stock.put(p.getNameProduct(),p.getStock());
    price.put(p.getNameProduct(),p.getPrice());
  }
  public int price (product p) {
    return price.getOrDefault(p.getNameProduct(), -99);
  }
}

public class COLLECTION001 {
  public static void main(String[] args) {
    Warehouse w = new Warehouse();
    product p1 = new product("milk", 10, 3);
    product p2 = new product("coffee", 3, 5);
    product p3 = new product("sugar", 5, 7);
    w.addProduct(p1);
    w.addProduct(p2);
    System.out.println("prices:");
    System.out.println(p1.getNameProduct() + ": " + w.price(p1));
    System.out.println(p2.getNameProduct() + ": " + w.price(p2));
    System.out.println(p3.getNameProduct() + ": " + w.price(p3));
  }


}
