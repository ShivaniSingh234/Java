import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        try(Scanner myObj = new Scanner(System.in)){;
        System.out.println("Enter time ");

        int time = myObj.nextInt();
        System.out.println("Time is "+ time);
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
    }
}
