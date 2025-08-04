package EXAMPLES;


import java.util.*;

public class TipMoney {
    static class Order {
        int index;
        int diff;

        Order(int index, int diff) {
            this.index = index;
            this.diff = diff;
        }
    }
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of N, P, Q: ");
            int N = sc.nextInt();
            int P = sc.nextInt();   
            int Q = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[N];

            System.out.println("Enter the values for array A: ");
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println("Enter the values for array B: ");
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }


            List<Order> orders = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                orders.add(new Order(i, Math.abs(A[i] - B[i])));
            }

            orders.sort((o1, o2) -> o2.diff - o1.diff);

            int totalTip = 0;
            int xCount = 0,yCount = 0;
            for (Order order : orders) {
                int i = order.index;
                if (A[i] >= B[i] && xCount<P) {
                    
                        totalTip += A[i];
                        xCount++;
                }
                else {
                        totalTip += B[i];
                        yCount++;
                    } 
                
            }
            System.out.println("Total tip money: " + totalTip);
        }
    }
}
