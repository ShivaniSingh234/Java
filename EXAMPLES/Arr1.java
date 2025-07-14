package EXAMPLES;

public class Arr1 {
    public static void main(String[] args) {
        int [] a = {12, 20, 35, 45, 87, 36, 5};

        // 1st way to print an array
        for(int i= 0 ; i<a.length;i++)
        {
            System.out.println("Elements of 1D array at a["+ i+"] is: " + a[i]);
        }

        // printing 2D array
        int[][] b = {{13, 20 , 50},{20, 30, 85, 65}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Element of 2D Array at a["+i+"]["+j+"] is: " + b[i][j]);
            }
        }
    }
}
