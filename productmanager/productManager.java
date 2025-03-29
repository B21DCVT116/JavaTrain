package productmanager;

import java.util.List;

import java.util.ArrayList;

import productmanager.product;

public class productManager {
  private List <product> products;

  public productManager() {
    this.products = new ArrayList < product > ();
  }

  public void addProduct(product p) {
    products.add(p);
  }

  

}
