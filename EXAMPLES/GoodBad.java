package EXAMPLES;

import java.util.Scanner;


public class GoodBad {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of test cases: ");
            int t = sc.nextInt();
            while(t-- > 0)
            {
                System.out.println("Enter the feedback string: ");

                String str = sc.next();
                if(str.contains("101") || str.contains("010")) {
                    System.out.println("Output: Good");
                } else  {
                    System.out.println("Output: Bad");
                }
            }
        }
    }
}
