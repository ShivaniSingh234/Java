package MAP;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicate {
     public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 6, 5, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, true);
        }

        System.out.println("Unique Elements: " + map.keySet());
    }
}
