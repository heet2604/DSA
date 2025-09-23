class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int mid = 0;
        int r = nums.length-1;
        while(mid<=r){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[l];
                nums[l] = temp;
                l++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            else {
                int temp = nums[mid];
                nums[mid] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}