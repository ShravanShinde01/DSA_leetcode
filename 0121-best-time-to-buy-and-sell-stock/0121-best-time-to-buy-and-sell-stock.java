
class Solution {
    public int maxProfit(int[] prices) {
        
        int minBuyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i= 0; i<prices.length; i++){
            minBuyPrice  = Math.min(prices[i],minBuyPrice);
            int sellPrice = prices[i];
            profit = Math.max(profit,sellPrice-minBuyPrice);
        }
        return profit;
    }
}