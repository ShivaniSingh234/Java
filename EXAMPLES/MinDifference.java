package EXAMPLES;

import java.util.Scanner;
import java.util.Arrays;

public class MinDifference {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = sc.nextInt();

            while (t-- > 0) {

                System.out.println("Enter the number of horses: ");
                int N = sc.nextInt();

                System.out.println("Enter the value of skills of horses: ");
                int[] S = new int[N];
                for (int i = 0; i < N; i++) {
                    S[i] = sc.nextInt();

                }
                Arrays.sort(S);
                int mindiff = Integer.MAX_VALUE;

                for (int i = 1; i < N; i++) {
                    int diff = S[i] - S[i - 1];
                    if (diff < mindiff)
                        mindiff = diff;

                }
                System.out.println("Output: " + mindiff);

            }

        }

    }
}