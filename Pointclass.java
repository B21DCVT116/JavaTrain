import java.util.Scanner;
import java.lang.Math;

class Point{
  private int x,y;
  public Point(int x, int y) {
    this.x=x;
    this.y=y;
  }
  public void setterX(int x){
    this.x=x;
  }
  public void setterY(int y){
    this.y=y;
  }
  public int getterX(){
    return this.x;
  }
  public int getterY(){
    return this.y;
  }
  public void move(int dx,int dy){
    x+=dx;
    y+=dy;
  }
}

public class Pointclass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int t = scanner.nextInt();  
    while (t-->0){
      int x1 = scanner.nextInt();
      int y1 = scanner.nextInt();
      int x2 = scanner.nextInt();
      int y2 = scanner.nextInt();
      Point p1 =  new Point(x1,y1);
      p1.move(1,1);
      Point p2 =  new Point(x2,y2);
      double result = Math.sqrt(Math.pow(p1.getterX()-p2.getterX(),2)+Math.pow(p1.getterY()-p2.getterY(),2));
      System.out.printf("%.2f\n", result);
        
    }
    scanner.close();
  }
}
