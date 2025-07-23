package COLLECTIONS;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1); c.add(2); c.add(2); c.add(3); c.add(5);

        ArrayList<Integer> d = new ArrayList<>();
        d.add(2); d.add(2);d.add(5);d.add(6);
        
        System.out.println("Elements of ArrayList a: " + c);
        System.out.println("Elements of ArrayList b: " + d);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer i : c) {
            if(d.contains(i))
            {
                result.add(i);
                d.remove(i);
            }
        }
        System.out.println("Intersection of both ArrayList: " + result);

    }
}
