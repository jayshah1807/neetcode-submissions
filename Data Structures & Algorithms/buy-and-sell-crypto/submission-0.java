class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxReturn = 0;
        
        for (int i = 1; i < prices.length; i++){
            maxReturn = Math.max(maxReturn, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        return maxReturn;
    }
}
