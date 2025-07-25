package SETS;

import java.util.HashSet;
import java.util.TreeSet;

public class BasicOperations {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");
        System.out.println(cars);

        // Hashset of numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        // TreeSet
        TreeSet<Integer> num = new TreeSet<>();
        num.add(40);
        num.add(10);
        num.add(30);
        num.add(20);

        for (int n : num) {
            System.out.println(n);
        }
    }
}
