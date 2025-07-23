package COLLECTIONS;

import java.util.ArrayList;

// Basic operations in ArrayList

class List {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10); a1.add(20); a1.add(90);
        System.out.println("Original ArrayList : " + a1);

        // Adding at specific index
        a1.add(3, 25);
        System.out.println("After adding element at index 3 : "+ a1);
        // Deletion of elements
        a1.remove(0);
        System.out.println("Element at index 0 is removed: " + a1);
        // updating values
        a1.set(0, 35);
        System.out.println("List after updation: " + a1);

    }
}
