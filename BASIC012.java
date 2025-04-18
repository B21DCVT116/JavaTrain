import java.util.Scanner;

public class BASIC012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while(t-- >0) {
            String[] s = sc.nextLine().split(" ");
            int[] a = new int[s.length];
            for (int j = 0; j < s.length; j++) {
                a[j] = Integer.parseInt(s[j]);
            }
            System.out.println(longestSortedSequence(a));
          }
          sc.close();
        }
        public static int longestSortedSequence(int[] a){
          if(a.length == 0) return 0;
          int maxLength = 1;
          int currentLength = 1; 
          for (int i = 1; i < a.length; i++) {
              if (a[i] >= a[i - 1]) {
                  currentLength++;
                  maxLength = Math.max(maxLength, currentLength); 
              } 
              else 
                  currentLength = 1;
              
          }
          return maxLength;
  }
}