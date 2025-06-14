abstract class Product{
  private String name;
  private double price;
  private double quantity;
  public Product(String name, double price, double quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public double getQuantity() {
    return quantity;
  }
  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  abstract double calculateCost(double quantity);

  public String displayDetails() {
    return "Name: " + name + "\nPrice: " + price + "\nAvailable Quantity: " + quantity;
  }
}

class Book extends Product {
  private String author;
  public Book(String name, double price, double quantity, String author) {
    super(name, price, quantity);
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  double calculateCost(double quantity) {
    return  (getPrice() * quantity);
  }

  @Override
  public String displayDetails() {
    return super.displayDetails() + "\nAuthor: " + author;
  }
}

class Electronic extends Product {
  private String brand;
  public Electronic(String name, double price, double quantity, String brand) {
    super(name, price, quantity);
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  double calculateCost(double quantity) {
    return (getPrice() * quantity * 1.1);
  }

  @Override
  public String displayDetails() {
    return super.displayDetails() + "\nBrand: " + brand;
  }
}

class User {
  private String username;
  private String totalSpent;
  public User(String username) {
    this.username = username;
    this.totalSpent = "0";
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getTotalSpent() {
    return totalSpent;
  }
  public void setTotalSpent(String totalSpent) {
    this.totalSpent = totalSpent;
  }
  public void buyProduct(Product product, double quantity){
    if (quantity > product.getQuantity()) {
      System.out.println("Insufficient quantity of "+ product.getName() +" available.");
    }else{
      System.out.println("User: " + this.username + " bought " + quantity + " " + product.getName() + " for $");
      product.setQuantity(product.getQuantity() - quantity);
    }
  }
}

public class INHERITANCE010 {
  public static void main(String[] args) {
    Electronic laptop = new Electronic("laptop", 20, 10, "Dell");
    Book book = new Book("Harry Potter", 10, 12, "camnh");
    laptop.displayDetails();
    book.displayDetails();
    User user1 = new User("Alice");
    User user2 = new User("Bob");
    User user3 = new User("Charlie");
  };
}

