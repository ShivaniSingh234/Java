package COLLECTIONS;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

// Rotating by K position
public class RotateLL {
    public static void main(String[] args) {
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 2, 3, 5, 7, 9, 10));
        System.out.println("Original LinekdList: " + l2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value by which LL to be rotated right: ");
        int k = sc.nextInt();

        int n = l2.size();
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = l2.removeLast();
            l2.addFirst(last);
        }
        System.out.println("Rotated List : " + l2);

    }
}
