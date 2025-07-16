package METHODS;
import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {

    public static boolean AreAnagrams(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }



        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your first string: ");
            String str1 = sc.next();
            System.out.println("Enter your Second string : ");
            String str2 = sc.next();
            
            boolean res = AreAnagrams(str1, str2);
            if(res == true)
            System.out.println(str1 + " and " + str2 + " are anagrams.");
            else
            System.out.println(str1 + " and " + str2 + " are not anagrams.");


        }
    }
}
