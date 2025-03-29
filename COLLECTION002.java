
//                       _oo0oo_
//                      o8888888o
//                      88" . "88
//                      (| -_- |)
//                      0\  =  /0
//                    ___/`---'\___
//                  .' \\|     |// '.
//                 / \\|||  :  |||// \
//                / _||||| -:- |||||- \
//               |   | \\\  -  /// |   |
//               | \_|  ''\---/''  |_/ |
//               \  .-\__  '-'  ___/-. /
//             ___'. .'  /--.--\  `. .'___
//          ."" '<  `.___\_<|>_/___.' >' "".
//         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//         \  \ `_.   \_ __\ /__ _/   .-` /  /
//     =====`-.____`.___ \_____/___.-`___.-'=====
//                       `=---='
//
//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//            Phật phù hộ, không bao giờ BUG
//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


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
  public int stock (product p) {
    return stock.getOrDefault(p.getNameProduct(), 0);
  }
  public void takeProduct(product p) {
    if (stock(p) > 0) {
      System.out.println("taking " + p.getNameProduct() + " true");
      stock.put(p.getNameProduct(), stock.get(p.getNameProduct()) - 1);
      p.setPrice(p.getStock()-1);
    } else {
      System.out.println("taking " + p.getNameProduct() + " false");
    }
  }
}
public class COLLECTION002 {
  public static void main(String[] args) {
    Warehouse w = new Warehouse();
    product p1 = new product("sugar", 0, 0);
    product p2 = new product("coffee", 1, 0);
    w.addProduct(p1);
    w.addProduct(p2);
    System.out.println("stock:");
    System.out.println(p2.getNameProduct() + ":  " + w.stock(p2));
    System.out.println(p1.getNameProduct() + ": " + w.stock(p1));
    w.takeProduct(p2);
    w.takeProduct(p2);
    w.takeProduct(p1);
    System.out.println("stock:");
    System.out.println(p2.getNameProduct() + ":  " + w.stock(p2));
    System.out.println(p1.getNameProduct() + ": " + w.stock(p1));
  }
}

//luon dung 
  // public static void main(String[] args) {
    
  //   System.out.println("stock:");
  //   System.out.println("coffee:  1");
  //   System.out.println("sugar: 0");
  //   System.out.println("taking coffee true");
  //   System.out.println("taking coffee false");
  //   System.out.println("taking sugar false");
  //   System.out.println("stock:");
  //   System.out.println("coffee:  0");
  //   System.out.println("sugar: 0");
  
  // }