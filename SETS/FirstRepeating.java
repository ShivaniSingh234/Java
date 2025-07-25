package SETS;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6, 7, 8, 7};
        System.out.println("Original Array: ");
        for (int i : arr) {
        System.out.print(i + " ");
            
        }System.out.println();


        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("First repeating: " + num);
                return;
            }
        }
        System.out.println("No repeating element.");
    }
}
