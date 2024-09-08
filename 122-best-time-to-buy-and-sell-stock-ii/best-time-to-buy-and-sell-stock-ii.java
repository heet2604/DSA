class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==1){
            return 0;
        }
        int max=0;
        int minprice=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minprice;
            if(prices[i]>prices[i-1]){
                max+=profit;
                minprice=prices[i];
            }
            if(prices[i]<minprice){
                minprice=prices[i];
            }
        }
        return max;
    }
}