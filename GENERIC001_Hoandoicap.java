import java.util.Scanner;

class pair <T> {
  private T first;
  private T second;
  public pair(T first, T second) {
    this.first = first;
    this.second = second;
  }

  public String swap(){
    T temp = first;
    first = second;
    second = temp;
    if (first instanceof String){
      return "'" + first + "'" + " '" + second + "'";
    }
    return first + " " + second;
  }
}

public class GENERIC001_Hoandoicap {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s = sc.nextLine();
      String [] part = s.split(" ");
      if (part[0].matches("-?\\d+") && part[1].matches("-?\\d+")){
        pair<Integer> p = new pair<>(
        Integer.parseInt(part[0]),
        Integer.parseInt(part[1])
        );
        System.out.println(p.swap());
      } else {
        pair<String> p = new pair<>(part[0], part[1]);
        System.out.println(p.swap());
      }
    }
  }
}
