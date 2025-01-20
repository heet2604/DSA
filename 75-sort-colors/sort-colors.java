class Solution {
    public void sortColors(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            int check=0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    check=1;
                }
            }
            if(check==0){
                break;
            }
        }
    }
}