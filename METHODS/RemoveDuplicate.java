package METHODS;

import java.util.Scanner;

public class RemoveDuplicate {
    
     public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter your string with repeating characters: ");
            String str = sc.next();
            System.out.println("String with no duplicates is: " + removeDuplicates(str));

        }
        
    }
}
