import java.util.Scanner;

abstract class Shape {
  private String name;
  public Shape(String name) {
    this.name = name;
  }
  public abstract Double calculateArea();

  void display(){
    System.out.printf("Shape:"+ name +"|Area: %.2f\n", this.calculateArea());
  }
}


class Rectangle extends Shape{
  private double width;
  private double height;
  public Rectangle(String name, double width, double height){
    super(name);
    this.width = width;
    this.height = height;
  }
  public Double calculateArea(){
    return width * height;
  }
}


class Circle extends Shape{
  private double radius;
  public Circle(String name, double radius){
    super(name);
    this.radius = radius;
  }
  public Double calculateArea(){
    return Math.PI * radius * radius;
  }
}
public class ABSTRACT001_Hinhdangvadientich {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- >0) {
      String name = input.next();
      if(name.equals("Rectangle")){
        double width = input.nextDouble();
        double height = input.nextDouble();
        Rectangle r = new Rectangle(name, width, height);
        r.display();
      }
      else{
        double radius = input.nextDouble();
        Circle c = new Circle(name, radius);
        c.display();
      }
    }
  }
}
