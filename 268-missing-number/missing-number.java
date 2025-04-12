class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int sum=0;
        // int total=n*(n+1)/2;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        // }
        // return total-sum;
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
}