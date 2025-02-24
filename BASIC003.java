import java.util.Scanner;
public class BASIC003 {
  static boolean isLeapYear(int year){
    if(year%4==0&&year%100!=0 || year%400==0){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-->0){
  int year = input.nextInt();
  String result;
  result = (isLeapYear(year)) ? year + " : Leap-year" : year + " : Non Leap-year";
  System.out.println(result);
    }
}
}
