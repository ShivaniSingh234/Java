package EXAMPLES;
import java.util.Scanner;


public class MInMaxArray {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in))
        {
            System.out.println("Enter the number of elements for array: ");
            int n = s.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elments of Array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                
            }
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < n; i++) {
                
                if(arr[i]>=max)
                max = arr[i];
                if(arr[i]<=min);
                {
                    min = arr[i];
                }

            }

            System.out.println("Maximum element in array is: " + max);
            System.out.println("Minimum element in array is: " + min);


        }
    }
}
