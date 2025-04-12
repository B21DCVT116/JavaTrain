
import java.util.Scanner;

class NotContainVowelException extends Exception {
  public NotContainVowelException(String message) {
    super(message);
  }
}

public class EXCEPTION006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume the newline character after the integer input
    while(t-->0){
      String s = sc.nextLine();
      try{
        if(!s.matches(".*[aeiouAEIOU].*")){
          throw new NotContainVowelException("String not contain vowels");
        }
        System.out.println("String has vowels");
      }
      catch(NotContainVowelException e){
        System.out.println(e.getMessage());
      };      
    }
    sc.close();
  }
}