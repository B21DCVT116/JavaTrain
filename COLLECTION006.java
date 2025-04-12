
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COLLECTION006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      String [] list = s.split(" ");
      Map <Integer, Integer> map = new HashMap<>();
      for (int i = 1; i < list.length; i += 2) {
        if(map.get(Integer.parseInt(list[i]))==null) {
          map.put(Integer.parseInt(list[i]), 1);
        } else {
          map.put(Integer.parseInt(list[i]), map.get(Integer.parseInt(list[i])) + 1);
        }
      }
      int min = Integer.MAX_VALUE;
      int keymin = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() < min) {
          min = entry.getValue();
          keymin = entry.getKey();
        }else if (entry.getValue() == min) {
          if(entry.getKey() < keymin) {
            keymin = entry.getKey();
          }
        }
      }
      System.out.println(keymin);
    }
    sc.close();
  }
}
