import java.util.Scanner;

public class BASIC022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        if (n < 2) {
            System.out.println("No primes in the range.");
            return;
        }

        System.out.println("Primes in the range 2 to " + n + ":");
        int primeCount = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
        }

        System.out.println("Total number of primes in the range: " + primeCount);

        if (isPrime(primeCount)) {
            System.out.println("The prime count " + primeCount + " is a prime number.");
        } else {
            System.out.println("The prime count " + primeCount + " is not a prime number.");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}