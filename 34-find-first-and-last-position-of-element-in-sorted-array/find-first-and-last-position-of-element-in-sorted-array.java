class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int result[]=new int[]{-1,-1};
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                result[0]=mid;
                r=mid-1;                        //search in the first half of the array
            } 
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        l=0;                             //reset the index of l and r
        r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                result[1]=mid;
                l=mid+1;                    //search in the second half of the array
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return result;
    }
}
