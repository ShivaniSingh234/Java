
public class Arrays {
    public static void main(String[] args) {

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
        System.out.print("Original array of ages : ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
        float avg, sum = 0;
        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;
        System.out.println("The average age is: " + avg);
    }
}
