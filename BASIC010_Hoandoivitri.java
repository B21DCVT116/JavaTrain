
import java.util.Scanner;

class SwapNumber{
  
  public String swap (int i, String s){
    char[] arrChars = s.toCharArray();
    for (int j = i; j < arrChars.length-1; j+=2) {
      char temp = arrChars[j];
      arrChars[j] = arrChars[j+1];
      arrChars[j+1] = temp;
    }
    return new String(arrChars);
  }
}

public class BASIC010_Hoandoivitri {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      input.nextLine();
      while (t-->0){
        String s = input.next();
        char[] arrChars = s.toCharArray();
        if (arrChars.length % 2 == 0 ) {
          SwapNumber swapNumber = new SwapNumber();
          s = swapNumber.swap(0, s);
        } else {
          SwapNumber swapNumber = new SwapNumber();
          s = swapNumber.swap(1, s);
        }
        System.out.println(s);
      }
    input.close();
  }
}
