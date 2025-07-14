package EXAMPLES;
import java.util.Scanner;


public class RevString {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter new String: ");
            String str = s.next();
            String rev = " ";
            for (int i = str.length()-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
                System.out.println("Reverse of "+ str +" is: "+ rev);
        }
    }
}
