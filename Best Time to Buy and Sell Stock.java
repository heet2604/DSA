You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

  
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==1){
            return 0;
        }
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
            if(prices[i]<minprice){
                minprice=prices[i];
            }
        }
        return maxprofit;
    }
}
