package EXAMPLES;

import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = sc.nextInt();
            while (t-- > 0) {

                System.out.println("Enter the value of X, Y, K, N : ");
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int K = sc.nextInt();
                int N = sc.nextInt();

                int requiredPages = X - Y;
                boolean happy = false;
                System.out.println("Enter the value of Pi and Ci: ");
                for (int i = 0; i < N; i++) {
                    int Pi = sc.nextInt();
                    int Ci = sc.nextInt();
                    if (Pi >= requiredPages && Ci <= K) {
                        happy = true;
                    }
                }
                if (happy) {
                    System.out.println("HappyAmit");
                } else {
                    System.out.println("SadAmit");
                }
            }

        }
    }
}