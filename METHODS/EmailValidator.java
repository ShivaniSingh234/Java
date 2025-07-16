package METHODS;
import java.util.Scanner;


public class EmailValidator {
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.endsWith(".com");
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter your email: ");
            String email = sc.next();
            System.out.println("Valid Email? " + isValidEmail(email)); 


        }
    }
}
