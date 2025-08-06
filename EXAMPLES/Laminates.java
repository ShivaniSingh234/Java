package EXAMPLES;

import java.util.Scanner;

public class Laminates {

    static long possibilities(int n, int k) {
        if (k > n)
            return 0;
        if (k == n)
            return 1;

        if (k > n - k) {
            k = n - k;
        }

        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = sc.nextInt();
            while (t-- > 0) {
                System.out.println("Enter the enumber of laminates and different colors: ");
                int n = sc.nextInt();
                int k = sc.nextInt();

                if (n < k) {
                    System.out.println(1);
                } else {
                    System.out.println("Output: " + possibilities(n - 1, k - 1));
                }

            }
        }
    }
}
