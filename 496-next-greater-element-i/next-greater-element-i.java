class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int nextgreater = -1;
            boolean found = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found = true;
                }
                if(found==true && nums2[j]>nums1[i]){
                    nextgreater = nums2[j];
                    break;
                }
            }
            result[i]=nextgreater;
        }
        return result;
    }
}