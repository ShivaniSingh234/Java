package EXAMPLES;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in))
        {
            System.out.println("Enter the number of Strings you wanted: ");
            int num = s.nextInt();
            s.nextLine();


            String[] str = new String[num];
            System.out.println("Enter the Strings you wanted: ");
             for (int i = 0; i < num; i++) {
                str[i] = s.nextLine();
            }

            String temp;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num-1-i ; j++) {
                    if(str[j].compareTo(str[j+1])> 0)
                    {
                        temp = str[j];
                        str[j] = str[j+1];
                        str[j+1] = temp;
                    }
                }
            }
            System.out.println("sorted Strings are: ");
            for (int i = 0; i < num; i++) {
                System.out.println(str[i]);
                
            }
            
        }
    }
}
