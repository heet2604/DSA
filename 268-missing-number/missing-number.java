class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return total-sum;
    }
}