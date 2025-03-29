import java.util.Scanner;

abstract class Aminimal {
  public String name;
  public abstract void makeSound();
}

interface flyable{
  public void fly();
}

interface swimable{
  public void swim();
}

class Dog extends Aminimal implements swimable{
  public void swim(){
    System.out.println("(biet boi)");
  }
  public void makeSound(){
    System.out.println("Gau gau");
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine();
    while (t-->0) {
      
    }
  }
}
