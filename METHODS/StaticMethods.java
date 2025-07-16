package METHODS;

import java.util.Scanner;

public class StaticMethods {

    static void MyName(String s) {
        System.out.println("Hello, your name is: " + s);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            MyName(name); // static method calling of same class
            Xyz.MyAge(age); // static method calling of different class

        }

    }
}

class Xyz {
    static void MyAge(int a) {
        System.out.println("Your age is: " + a);
    }
}
