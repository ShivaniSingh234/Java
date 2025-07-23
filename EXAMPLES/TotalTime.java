package EXAMPLES;

import java.util.Scanner;

public class TotalTime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of Test cases: ");
            int t = sc.nextInt();

            while (t-- != 0) {
                int c0 = 0, c1 = 0;

                System.out.println("Enter the value of length of binary String: ");
                int N = sc.nextInt();
                System.out.println("Enter the value of A time in seconds: ");
                int A = sc.nextInt();
                System.out.println("Enter the value of B time in seconds: ");
                int B = sc.nextInt();
                System.out.println("Enter the value of binary string S: ");
                String S = sc.next();

                for (int i = 0; i < S.length(); i++) {
                    if (S.charAt(i) == '0')
                        c0++;
                    else if (S.charAt(i) == '1')
                        c1++;

                }
                System.out.println("Total time is: " + (c0 * A + c1 * B));

            }
            sc.close();

        }
    }
}