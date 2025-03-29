import java.util.*;

class author {
  private String nameAuthor;
  private String email;
  private char gender;
  public author(String nameAuthor, String email, char gender) {
    this.nameAuthor = nameAuthor;
    this.email = email;
    this.gender = gender;
  }
  public String getName() {
    return nameAuthor;
  }
  public void setName(String name) {
    this.nameAuthor = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public char getGender() {
    return gender;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }
  public String toString (){
    return " Author[name=" + this.getName() +", email="+ this.getEmail()+", gender="+ this.getGender() +"]";
  }
}

class book {
  private String name;
  private author author;
  private double price;
  private int qty = 0;
  public book(String name, author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public author getAuthor() {
    return author;
  }
  public void setAuthor(author author) {
    this.author = author;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public int getQty() {
    return qty;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }
  public String toString (){
    return " Book[name=" + this.getName() +", author="+ this.getAuthor()+", price="+ this.getPrice() +", qty="+ this.getQty() +"]";
  }  
}

public class OOP012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-->0) {
      book book = new book(null, null, 0, 0);
      author author = new author(null, null, '0');
      String obj = sc.nextLine();
      while (obj!="END") {
        switch (obj) {
          case "Author":
            String nameAuthor = sc.nextLine();
            String email = sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            author = new author(nameAuthor, email,gender);
            break;
          case "Book":
            String nameBook = sc.nextLine();
            Double price = sc.nextDouble();
            int qty = sc.nextInt();
            book = new book(nameBook, author, price, qty);
            break;
          default:
            break;
        }
      }
      book.toString();
    }
  }
  
}
