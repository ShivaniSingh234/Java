public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        int x = 10;
        System.out.println(x += 5);
        System.out.println(x -= 3);
        System.out.println(x *= 3);
        System.out.println(x /= 3);
        int y = 9;
        System.out.println(y %= 2);
        System.out.println(y &= 3);
        int s = 16;
        System.out.println(s >>= 3);
        System.out.println(s <<= 3);

        // Comparison Operators
        int z = 5;
        int t = 3;
        System.out.println(z > t);
        System.out.println(z < t);
        System.out.println(z == t);
        System.out.println(z != t);
        System.out.println(z >= t);
        System.out.println(z <= t);

        // Logical Operators
        System.out.println(x > 5 && x < 10);
        System.out.println(x < 5 || x < 4);
        System.out.println(!(x < 5 && x < 10));


        // precedence question
        System.out.println(20 + 10 * 20 - 40 / 30);
        System.out.println(20 + 10 / 20);

    }
}
