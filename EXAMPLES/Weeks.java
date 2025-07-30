package EXAMPLES;

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of test cases:");
            int t = sc.nextInt();

            System.out.println("Enter the value of d, a, b, c : ");
            while(t-- >0)
            {
                int d = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int work1 = 7 * a;
                int work2 = d * b + (7 - d) * c;

                System.out.println("Output : " + Math.max(work1, work2));

            }
        }
    }
}
