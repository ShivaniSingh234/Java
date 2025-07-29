package MAP;

import java.util.TreeMap;


//program for sorting of scores

public class Sorting {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();

        scores.put("Virat", 99);
        scores.put("Jadeja", 89);
        scores.put("Gill", 55);
        scores.put("Pant", 69);
        scores.put("Rohit", 90);

        for(String s : scores.keySet())
        {
            System.out.println(s + " : " + scores.get(s));
        }

    }
}
