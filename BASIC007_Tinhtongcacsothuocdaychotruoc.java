import java.util.Scanner;
public class BASIC007_Tinhtongcacsothuocdaychotruoc {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while(t-->0){
      int l = input.nextInt();
      int r = input.nextInt();
      int sum = 0;
      for(int i = l; i <= r; i++){
        sum += i;
      }
      System.out.println(sum);
    }
  }
}
