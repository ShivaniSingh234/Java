public class Operators {
    public static void main(String[] args) {
        // Assignment Operators
        int x = 10;
        System.out.println(x += 5);
        System.out.println(x -= 3);
        System.out.println(x *= 3);
        System.out.println(x /= 3);
        int y = 9;
        System.out.println(y %= 2);
        System.out.println(y &= 3);
        int s=16;
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

    }
}
