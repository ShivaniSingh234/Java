package EXAMPLES;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases:");
            int t = sc.nextInt();

            while (t-- > 0) {
                System.out.println("Enter the value of m and n: ");
                int m = sc.nextInt();
                int n = sc.nextInt();

                for (int i = m; i <= n; i++) {
                    if (isPrime(i)) {
                        System.out.println(i);

                    }

                }

            }
        }
    }
}
