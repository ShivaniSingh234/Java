package EXAMPLES;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        try (Scanner myObj = new Scanner(System.in)){
        do {
             
            System.out.print("Enter first number: ");
            int num1 = myObj.nextInt();
            System.out.print("Enter first number: ");
            int num2 = myObj.nextInt();
            System.out.print("Enter Symbol(+, -, *, /, %): ");
            String symbol = myObj.next();
            int res;
            
            switch (symbol) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Addition is: " + res);

                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("Subtraction is: " + res);

                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("Multiplication is: " + res);

                    break;
                case "/":
                    res = num1 / num2;
                    System.out.println("Division is: " + res);

                    break;
                case "%":
                    res = num1 % num2;
                    System.out.println("Modulus is: " + res);

                    break;

                default:
                    System.out.println("Invalid Symbol");
                    break;
            }
            System.out.println("Do you want to continue(Press y for yes and n for No: )" );
            yn = myObj.next();
            }
         while (yn.equals("y")||yn.equals("Y"));
        
        
        }

    
}
}
