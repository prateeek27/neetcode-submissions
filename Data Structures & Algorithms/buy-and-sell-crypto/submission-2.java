class Solution {
    public int maxProfit(int[] a) {
        int buyDay = a[0];
        int maxP = 0;

        for(int i=0;i<a.length;i++){
            if(buyDay>a[i])
                buyDay = a[i];
            maxP = Math.max(maxP,a[i]-buyDay);
        }
        return maxP;
    }
}
