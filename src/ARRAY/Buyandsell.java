package ARRAY;

public class Buyandsell {

    public static void main(String[] args) {

        int[] prices = {7, 1, 4, 3, 6, 2};

        int min = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if(prices[i] < min) {
                min = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - min;

            // Update maximum profit
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}