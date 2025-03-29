
import java.util.Scanner;

public class BASIC011 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
      
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine().trim();
      String [] arr = s.split(" ");
        if (arr.length<2){
            System.out.println(0);
            continue;
        }
      int min = Integer.MAX_VALUE;
      for(int i=0;i<arr.length-1;i++){
        if(Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i])<=min){
          min = Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i]);
        }
      }
      System.out.println(min);
    }
  }
}
