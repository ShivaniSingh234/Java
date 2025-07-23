package COLLECTIONS;

import java.util.ArrayList;

public class Filter {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();
        s.add("Tata");
        s.add("Mahindra");
        s.add("Mercedes");
        s.add("Roles Royes");

        char start = 'M';
        System.out.println("Strings starting with " + start + " are: ");
        for (String sc : s) {
            if (sc.startsWith(String.valueOf(start)))
                System.out.println(sc);
        }
    }
}
