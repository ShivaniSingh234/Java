package METHODS;

public class BillingSystem {
    public static double totalBill(double[] prices, double[] discounts) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i] - (prices[i] * discounts[i] / 100);
        }
        return total;
    }

    public static void main(String[] args) {
        double[] prices = { 500, 1500, 800 };
        double[] discounts = { 10, 20, 5 }; // in %
        System.out.println("Total payable: Rs." + totalBill(prices, discounts));
    }
}
