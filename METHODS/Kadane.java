package METHODS;

public class Kadane {

     public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Original Array is: ");
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");   
        }
        System.out.println();
        System.out.println("Max Subarray sum: " + maxSubArraySum(arr));
    }
}
