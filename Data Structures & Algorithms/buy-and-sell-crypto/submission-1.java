class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buyDay)
                max = Math.max(max,prices[i]-buyDay);
            else if(prices[i]<buyDay)
                buyDay = prices[i];
        }
        return max;
    }
}
