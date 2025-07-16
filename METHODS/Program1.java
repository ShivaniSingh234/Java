package METHODS;
import java.util.Scanner;

public class Program1 {
    int Add(int a, int b)
    {
        return a + b;
    }
    int Sub(int a, int b)
    {
        return a - b;
    }
    int Mul(int a, int b)
    {
        return a * b;
    }
    int Div(int a, int b)
    {
        return a / b;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        Program1 p = new Program1();

        System.out.println("Addition of "+ num1 +" and "+ num2 + " is: " + p.Add(num1,num2));
        System.out.println("Subtraction of "+ num1 +" and "+ num2 + " is: " + p.Sub(num1,num2));
        System.out.println("Multiplication of "+ num1 +" and "+ num2 + " is: " + p.Mul(num1,num2));
        System.out.println("Division of "+ num1 +" and "+ num2 + " is: " + p.Div(num1,num2));

        }
    }
}
