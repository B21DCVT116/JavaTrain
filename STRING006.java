import java.util.Scanner;

public class STRING006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        while (t-- > 0) {
            String s = scanner.nextLine();
            String [] list = s.split(" ");
            String result="";
            for(String x : list){
              result += x.charAt(0);
            }
            System.out.println("My initials are: "+result);
        }
        scanner.close();
      }
}
