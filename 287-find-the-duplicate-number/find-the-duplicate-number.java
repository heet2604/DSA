class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // int l = 1;
        // int h = nums.length-1;
        // int dup = -1;
        // while(l<=h){
        //     int mid = l + (h-l)/2;
        //     int count = 0;

        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]<=mid){
        //             count++;
        //         }
        //     }
        //     if(count>mid){
        //         dup = mid;
        //         h = mid-1;
        //     }
        //     else{
        //         l = mid+1;
        //     }
        // }
        // return dup; 
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return nums[j];
            }
        }
        return nums[nums.length-1];
    }
}