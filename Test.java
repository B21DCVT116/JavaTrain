import java.util.Scanner;

public class Test{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
           int[] mark = new int[26];
            for(int i = 0; i < s.length(); ++i){
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z') mark[c-'a'] = 1;
            }
            int k = 0;
            for(int x:mark) if(x == 0) k = 1;
            if(k == 1) System.out.println("false");
            else System.out.println("true");
        }
    }
}