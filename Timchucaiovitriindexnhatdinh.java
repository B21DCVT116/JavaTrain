import java.util.Scanner;

public class Timchucaiovitriindexnhatdinh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s = sc.nextLine();
      int index = Integer.parseInt(s.substring(s.length()-1));
      System.out.println("The character at position "+ index +" is "+s.charAt(index));
    }
  }
}
