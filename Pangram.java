import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine();
    while (t-- > 0) {
      String s = scanner.nextLine();
      s = s.toLowerCase();
      Set<Character> hashSet = new HashSet<>();
      for (char c : s.toCharArray()) {
        hashSet.add(c);
      }
      if (hashSet.size() == 26) {
        System.out.println("true");
        
      }
      else {
        System.out.println("false");
      }
    }
    scanner.close();
  }
}
