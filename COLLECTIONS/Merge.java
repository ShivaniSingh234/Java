package COLLECTIONS;

import java.util.ArrayList;


public class Merge {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22); a.add(44); a.add(43);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(67);b.add(56);
        
        System.out.println("Elements of ArrayList a: " + a);
        System.out.println("Elements of ArrayList b: " + b);

        a.addAll(b);
        System.out.println("New merged ArrayList: " + a);


    }
}
