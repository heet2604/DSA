class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int l = 0;
        int odd = 0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                odd++;
                count=0;
            }
            while(odd==k){
                if(nums[l]%2!=0){
                    odd--;
                }
                count++;
                l++;
            }
            res+=count;
        }
        return res;
    }
}