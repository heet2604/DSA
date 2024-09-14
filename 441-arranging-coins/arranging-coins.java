class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;        
            n-=i;       //keeps the track of remaining coins
        }
        return i-1; 
    }
}