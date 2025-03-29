import java.util.Scanner;

public class SudungStringBufferdelaychieudaichuoi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(sc.nextLine());
      System.out.println(buffer.length());
    }
    sc.close();
  }
}
