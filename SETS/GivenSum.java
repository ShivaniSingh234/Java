package SETS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        System.out.println("Original Array: ");
        for (int i : arr) {
        System.out.print(i + " ");
            
        }System.out.println();

        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the value of sum to be found: ");
        int sum = sc.nextInt();
        Set<Integer> sum2 = new HashSet<>();
        for (int num : arr) {
            int diff = sum - num;
            if (sum2.contains(diff)) {
                System.out.println("Pairs : (" + num + ", " + diff + ")");
            }
            sum2.add(num);
        }
    }
    }
}
