package SETS;

import java.util.Set;
import java.util.TreeSet;


class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class PriorityMarks {
    

        public static void main(String[] args) {
        Set<Student> students = new TreeSet<>((a, b) -> {
            if (a.marks != b.marks) return a.marks - b.marks;
            return a.name.compareTo(b.name);         //for tie-breaking
        });

        students.add(new Student("A", 90));
        students.add(new Student("B", 85));
        students.add(new Student("C", 90));

        for (Student s : students) {
            System.out.println(s); // Sorted by marks, then name
        }
        
    }
}
