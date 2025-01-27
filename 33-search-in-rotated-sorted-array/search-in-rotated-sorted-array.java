class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            if(nums[l]==target){
                return l;
            }
            else if(nums[h]==target){
                return h;
            }
            else{
                l++;
                h--;
            }
        }
        return -1;
    }
}