package EXAMPLES;
import java.util.Scanner;

public class Factorial {
    

     int Fact(int n)
    {
        if(n<=1)
        return 1;

        return n * Fact(n-1);
    }
    public static void main(String[] args) {

        try(Scanner myObj = new Scanner(System.in))
        {
            System.out.print("Enter number: ");
            int num = myObj.nextInt();
            Factorial f = new Factorial();           //object of Factorial class
            System.out.println("Factorial of "+ num + " is: " + f.Fact(num));

        }
    }
}
