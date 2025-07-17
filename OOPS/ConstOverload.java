package OOPS;


class Rectangle {
    int length, breadth;

    // Constructor 1: no parameter
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Constructor 2: one parameter
    Rectangle(int side) {
        length = breadth = side;
    }
// Constructor 3: two parameters
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}
public class ConstOverload {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area r1: " + r1.area());
        System.out.println("Area r2: " + r2.area());
        System.out.println("Area r3: " + r3.area()); 
    }
}
