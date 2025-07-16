package METHODS;
import java.util.Scanner;

public class MethodOverload {

     public int mul(int a, int b)
        {
            int sum = a*b;
            return sum;
        }
        public int mul(int a, int b, int c)
        {
            int sum = a*b*c;
            return sum;
        }

    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in))
       {
            System.out.println("Enter first number: ");
            int num1 =sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 =sc.nextInt();

            System.out.println("Enter third number: ");
            int num3 =sc.nextInt();

            MethodOverload m = new MethodOverload();
            System.out.println(m.mul(num1, num2));
            System.out.println(m.mul(num1, num2, num3));
       }
       
        
    }
}
