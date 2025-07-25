package SETS;

import java.util.Scanner;
import java.util.TreeSet;

public class InputOpr {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        TreeSet<Integer> set1 = new TreeSet<>();
        System.out.println("Enter the size of the set: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the set: ");
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Set: " + set1);
    }

    }
}
