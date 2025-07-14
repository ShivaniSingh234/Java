package EXAMPLES;

import java.util.Scanner;
// import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = s.nextInt();
            int t1 = num, length = 0;
            while (t1 != 0) {
                length = length + 1;
                t1 = t1 / 10;

            }
            int t2 = num;

            int ans = 0;
            int rem;

            while (t2 != 0) {
                int mull = 1;
                rem = t2 % 10;
                for (int i = 1; i <= length; i++) {
                    mull = mull * rem;
                }
                ans = ans + mull;
                t2 = t2 / 10;
            }
            if (num == ans)
                System.out.println("An ArmStrong number");
            else
                System.out.println("Not an Armstrong number");
        }
    }
}
