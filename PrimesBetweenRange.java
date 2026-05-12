import java.util.Scanner;

public class PrimesBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter ending number (k): ");
        int k = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + k + ":");

        for (int num = n; num <= k; num++) {

            if (num <= 1) continue;

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}