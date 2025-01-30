class Solution {
    public int findPeakElement(int[] nums) {
        //int max = nums[0] ;
        if(nums.length==1){             //single element array
            return 0;
        }
        if(nums[0]>nums[1]){               //first element peak
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){ //last element peak
            return nums.length-1;
        }
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
        //         max=Math.max(max,nums[i]);
        //         return i;
        //     }
        // }
        int l = 1;
        int h = nums.length-2;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}