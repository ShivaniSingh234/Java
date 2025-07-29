package MAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Counting {
    public static void main(String[] args) {

        int arr[] = {1,13,4,5,6,8,9,10,11};
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a1.add(arr[i]);
        }

        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < a1.size(); i++) {
            h1.putIfAbsent(a1.get(i), Collections.frequency(a1, a1.get(i)));
        } 
        System.out.println(h1);
    }
}
