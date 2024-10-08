class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int nextgreater=-1;         
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;               //check if the number is present in both the arrays to check for the greater element 
                }
                if(found==true && nums2[j]>nums1[i]){
                    nextgreater=nums2[j];     //if greater is present change its value
                    break;                 //if the number is found no need to check any further
                }  
            }
            res[i]=nextgreater;                //add the greater element in the new array or add -1 if not 
        }
        return res;   
    }
}