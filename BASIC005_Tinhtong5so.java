import java.util.Scanner;

public class BASIC005_Tinhtong5so {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- > 0) {
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      int num4 = input.nextInt();
      int num5 = input.nextInt();
      System.out.println(num1 + num2 + num3 + num4 + num5);
    }

  }
}
