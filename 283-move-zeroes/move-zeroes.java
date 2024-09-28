class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1 && nums[0]==0){
            return;
        }
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==0){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        int nonzero=0;
        for(int i=0;i<nums.length;i++){         //bring all the non zero to the start of the array
            if(nums[i]!=0){
                nums[nonzero] = nums[i];
                nonzero++;
            }
        }
        for(int i=nonzero;i<nums.length;i++){    //fill all the remaining index with 0
            nums[i]=0;
        }
    }
}