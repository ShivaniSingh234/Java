package COLLECTIONS;

import java.util.LinkedList;

public class List2 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("java");
        l1.add("python");
        l1.add("C++");
        l1.add("rust");

        System.out.println("original LinkedList: " + l1);

        // Using addFirst
        l1.addFirst("C#");
        System.out.println("Changing first element: " + l1);

        // using addlast
        l1.addLast("Go");
        System.out.println("Adding element in Last: " + l1);

        // using removeFirst
        l1.removeFirst();
        System.out.println("Removing first element: " + l1);

        // using removeLast
        l1.removeLast();
        System.out.println("Removing Last element: " + l1);

        // using getFirst
        l1.getFirst();
        System.out.println("Getting first element: " + l1);

    }
}
