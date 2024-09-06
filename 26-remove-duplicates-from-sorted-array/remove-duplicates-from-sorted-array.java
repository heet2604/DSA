class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0 ){
            return 0;
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];             //returns the unique elements at the front 
            }
        }
        return j+1;      //returns the no of unique elements
    }
}