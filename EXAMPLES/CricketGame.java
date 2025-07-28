package EXAMPLES;


import java.util.Scanner;

public class CricketGame {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner (System.in))
        {

            System.out.println("Enter the number of test cases: ");
            int tcases = sc.nextInt();

            while(tcases-- >0){
            System.out.println("Enter the Value of A1, S1, B1 and A2, S2, B2: ");
            int A1 = sc.nextInt();
            int Z1 = sc.nextInt();
            int B1 = sc.nextInt();
            int A2 = sc.nextInt();
            int Z2 = sc.nextInt();
            int B2 = sc.nextInt();

            int sum1 = A1 + Z1 + B1;
            int sum2 = A2 + Z2 + B2;

            if( sum1 > sum2 )
            {
                System.out.println("Output : 1");
            }
            else
            System.out.println("Output: 2");
            }

        }
    }
}
