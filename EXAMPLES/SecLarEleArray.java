package EXAMPLES;

import java.util.Scanner;

public class SecLarEleArray {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in))
        {
            System.out.println("Enter the number of elements fopr array: ");
            int n = s.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the lements of Array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt(); 
            }


            // First Method
            /*
            
            int temp; 
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i]<arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
                


            System.out.println("Second largest element in Array: " + arr[1]);
            System.out.println("Second Smallest element in Array: " + arr[n-1]);

            */




            // 2nd method
            int largest = Integer.MIN_VALUE;
            int second_largest = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if(arr[i]>largest)
                {
                    second_largest = largest;
                    largest = arr[i];
                }                
                else if(arr[i] > second_largest && arr[i]!= largest)
                {
                    second_largest = arr[i];
                }
            }
if(second_largest == Integer.MIN_VALUE)
{
    System.out.println("there is no second largest eleemnt");
}
else
{
    System.out.println("Second largest value is : " + second_largest);
    System.out.println("Second smallest value is : " + arr[1]);

}










        }
    }
}
