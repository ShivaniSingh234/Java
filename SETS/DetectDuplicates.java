package SETS;

import java.util.HashSet;

public class DetectDuplicates {


    public static boolean hasDuplicate(int[] arr)
        {
            HashSet<Integer> n = new HashSet<>();
            for (Integer i : n) {
                if(!n.add(i))
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,6,1};
        System.out.println("Original Array: ");
        for (int i : arr) {
        System.out.print(arr[i] + " ");
            
        }System.out.println();
        
        boolean result  = hasDuplicate(arr);
        if(result == true)
        System.out.println("Arrays has no duplicate ");
        else
        System.out.println("Array has duplicate.");

        HashSet<Integer> duplicate = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        for (Integer i : arr) {
            if(!seen.add(i))
            duplicate.add(i);
            
        }
        System.out.println("The duplicate elements are: "+ duplicate);


        

    }
}
