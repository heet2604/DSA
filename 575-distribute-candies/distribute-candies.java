class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        int unique=1;
        int max = n/2;
        for(int i=0;i<n-1 && unique<max;i++){
            if(candyType[i]!=candyType[i+1]){
                unique++;
            }
        }
        return Math.min(unique,max);
    }
}