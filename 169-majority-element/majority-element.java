class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        // int index = 0,count=0;
        // for(int i=0;i<n;i++){
        //     if(count==0){
        //         index = i;
        //         count=1;
        //     }
        //     else if(nums[i]==nums[index]){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        // }
    
        for(int i=0;i<n-1;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}