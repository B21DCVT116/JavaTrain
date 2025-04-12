
import java.util.Scanner;

public class STRING009 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine();
      while(t-->0){
          String s = sc.nextLine();
          String result ="";
          for (int i = 0; i<s.length(); i++){
              result = result.concat(s.substring(0,i+1));
          }
          System.out.println(result);
      }
      sc.close();
  }
}
