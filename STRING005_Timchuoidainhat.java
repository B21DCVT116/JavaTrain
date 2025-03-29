
import java.util.Scanner;

public class STRING005_Timchuoidainhat {

    static void findword(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("");
            return;
        }
        String[] words = s.split(" ");
        String max = "";
        for (String word : words) {
            if (word.length() >= max.length()) {
                max = word;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            findword(s);
        }
        sc.close();
    }
}
