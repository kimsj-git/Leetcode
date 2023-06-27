class Solution {
    public int maxProfit(int[] prices) {
        int min_price = 10000;
        int max_profit = 0;
        for (int price : prices) {
            if (price < min_price) {
                min_price = price;
            }
            if (price - min_price > max_profit) {
                max_profit = price - min_price;
            }
        }
        return max_profit;
    }
}