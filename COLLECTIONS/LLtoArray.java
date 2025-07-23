package COLLECTIONS;

import java.util.Arrays;
import java.util.LinkedList;

public class LLtoArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
         list.add("java");
        list.add("python");
        list.add("C++");
        list.add("rust");

        
        String[] arr = list.toArray(new String[0]);
        System.out.println("LinkedList to Array : "+Arrays.toString(arr));

        // Checking for whether converted to array or not
        System.out.println(arr instanceof String[]);

    }
}
