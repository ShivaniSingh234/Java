package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

//program for counting the performance time for different map interfaces
public class MapPerformance {
     public static void main(String[] args) {
        int N = 10000;
        Random r = new Random();

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        long start, end;

        // HashMap
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            hashMap.put(r.nextInt(), i);
        }
        end = System.nanoTime();
        System.out.println("HashMap Insertion Time: " + (end - start) + " ns");

        // LinkedHashMap
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedHashMap.put(r.nextInt(), i);
        }
        end = System.nanoTime();
        System.out.println("LinkedHashMap Insertion Time: " + (end - start) + " ns");

        // TreeMap
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            treeMap.put(r.nextInt(), i);
        }
        end = System.nanoTime();
        System.out.println("TreeMap Insertion Time: " + (end - start) + " ns");
    }
}
