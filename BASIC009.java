
import java.util.Scanner;

public class BASIC009 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            if (a == 0 || b == 0) {
                ans = 0; 
            }else if (a > 0) {
                if (b > 0) {
                    ans = 1; 
                }else {
                    ans = 4;
                }
            } else if (a < 0) {
                if (b < 0) {
                    ans = 3; 
                }else {
                    ans = 2;
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
