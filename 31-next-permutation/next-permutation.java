class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-1;
        while(i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if(i>0){
            int j = n-1;
            while(nums[j]<=nums[i-1]){
                j--;
            }
            int temp = nums[i-1];
            nums[i-1] = nums[j];
            nums[j] = temp;
        }
        reverse(nums,i,n-1);
    }

    public static void reverse(int nums[],int l,int r){
        
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}