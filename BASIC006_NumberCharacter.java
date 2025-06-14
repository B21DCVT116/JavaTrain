import java.util.Scanner;

public class BASIC006_NumberCharacter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character after the integer input
    while (t-->0){
      String s = scanner.nextLine();
      int count = 0;
        s=s.toLowerCase();
      for (int i = 0; i < s.length(); i++) {
        if (Character.isDigit(s.charAt(i))) {
          count++;
        }
      }
        System.out.println(count);
    }
    scanner.close();
  }
}
