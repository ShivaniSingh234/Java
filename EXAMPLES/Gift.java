package EXAMPLES;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gift {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int total = 1 << N;

            long[] subsetSums = new long[total];
            System.out.println("Enter values: ");
            for (int i = 0; i < total; i++) {
                subsetSums[i] = sc.nextLong();
            }

            Arrays.sort(subsetSums);
            List<Long> result = new ArrayList<>();

            // Frequency map of subset sums
            TreeMap<Long, Integer> freq = new TreeMap<>();
            // System.out.println("Enter values: ");
            for (long val : subsetSums) {
                freq.put(val, freq.getOrDefault(val, 0) + 1);
            }

            
            freq.put(0L, freq.get(0L) - 1);
            if (freq.get(0L) == 0) freq.remove(0L);

            List<Long> generatedSubsets = new ArrayList<>();
            generatedSubsets.add(0L); // Start with empty subset

            for (int i = 0; i < N; i++) {
                long next = freq.firstKey();
                result.add(next);

                List<Long> newSubsets = new ArrayList<>();
                for (long val : generatedSubsets) {
                    long sum = val + next;
                    freq.put(sum, freq.get(sum) - 1);
                    if (freq.get(sum) == 0) freq.remove(sum);
                    newSubsets.add(sum);
                }

                generatedSubsets.addAll(newSubsets);
            }

            // Sort and print the result
            Collections.sort(result);
            System.out.println("Output: ");
            for (long val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}