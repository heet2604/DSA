class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){           //3rd max element has been found
                return nums[i-1];
            }
        }
        return nums[nums.length-1];        //if there are no enough elements
    }
}