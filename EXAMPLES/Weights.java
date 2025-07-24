package EXAMPLES;
import java.util.Scanner;


public class Weights {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of test cases: ");
            int cases = sc.nextInt();

            while(cases-- !=0)
            {
            System.out.println("Enter the value of P, Q, R, S, T: ");
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int T = sc.nextInt();


            if(P + Q <= S && R <= T)
            System.out.println("Yes");
            else if(Q + R <= S && P <= T)
            System.out.println("Yes");
            else if(P + R <= S && Q <= T)
            System.out.println("Yes");
            else
            System.out.println("No");
            }



        }

    }
}
