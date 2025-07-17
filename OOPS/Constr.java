package OOPS;


class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constr {
    public static void main(String[] args) {
        Student s1 = new Student();             // Default constructor
        Student s2 = new Student("Shivani", 20);   // Parameterized constructor

        s1.display();
        s2.display();
    }
}
