class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = first(nums,target);
        int l = last(nums,target);
        return new int[]{f,l};
    }
    public static int first(int nums[],int target){
        int l = 0;
        int r = nums.length-1;
        int result=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                result = mid;       
                r=mid-1;        // for leftmost "index" (searching in first half of the array)
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
    public static int last(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        int result = -1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                result = mid;
                l=mid+1;          //for rightmost "index" (searching in the second part of the array)
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