import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==1){
            return 0;
        }
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           if(prices[i]<minprice){
                minprice = prices[i];
            }
            int profit = prices[i]-minprice;
            if(profit>maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}