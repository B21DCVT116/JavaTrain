
import java.util.Scanner;

class Amount {
  private String currency;
  private int amount;

  public Amount(String currency, int amount) {
      this.currency = currency;
      this.amount = amount;
  }

  public int getAmount() {
      return amount;
  }

  public String getCurrency() {
      return currency;
  }

  public int add(Amount other) throws Exception {
      if (!this.currency.equals(other.getCurrency())) {
          throw new Exception("Currency doesn't match");
      }
      return this.amount + other.getAmount();
  }
}

public class EXCEPTION001_Kiemtratiente {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    while (t-->0) {
      Amount a1 = new Amount(sc.next(),sc.nextInt());
      Amount a2 = new Amount(sc.next(),sc.nextInt());
      try {
        System.out.println(a1.add(a2));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    sc.close();
  }
}
// import java.util.Scanner;

// class Amount {
//     private String currency;
//     private int amount;

//     public Amount(String currency, int amount) {
//         this.currency = currency;
//         this.amount = amount;
//     }

//     public void add(Amount other) throws Exception {
//         if (!this.currency.equals(other.currency)) {
//             throw new Exception("Currency doesn't match");
//         }
//         this.amount += other.amount;
//     }

//     public int getAmount() {
//         return amount;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNextLine()) {
//             String line = scanner.nextLine().trim();
//             if (line.isEmpty()) continue;
//             String[] tokens = line.split("\\s+");
//             if (tokens.length != 4) continue;

//             String curr1 = tokens[0];
//             int am1 = Integer.parseInt(tokens[1]);
//             String curr2 = tokens[2];
//             int am2 = Integer.parseInt(tokens[3]);

//             Amount amount1 = new Amount(curr1, am1);
//             Amount amount2 = new Amount(curr2, am2);

//             try {
//                 amount1.add(amount2);
//                 System.out.println(amount1.getAmount());
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }