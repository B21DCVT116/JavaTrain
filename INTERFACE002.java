import java.util.List;
import java.util.Scanner;

interface Movable {
  void move(int dx, int dy);
}

class Organism implements Movable{
  private int x;
  private int y;

  public Organism(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void move (int dx , int dy){
    x+=dx;
    y+=dy;
  }

  public String toString (){
    return "x:" + x + ";y:" + y;
  }
}

class Herd {
  List <Organism> organisms ;

  public Herd(List<Organism> organisms) {
    this.organisms = organisms;
  }

  public void addToHerd(Organism organism){
    organisms.add(organism);
  }

  public void move(int dx, int dy){
    for (Organism organism : organisms){
      organism.move(dx, dy);
    }
  }

  public String toString(){
    for (Organism organism : organisms){
      organism.toString();
    }
    return null;
  }
}
public class INTERFACE002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-->0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      Organism organism = new Organism(x, y);
      organism.move(1,1);
      System.out.println(organism.toString());
    }
    sc.close();
  }
}
