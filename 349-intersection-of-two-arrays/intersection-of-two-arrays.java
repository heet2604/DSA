class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(res.isEmpty() || res.get(res.size()-1)!=nums1[i]){
                    res.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int result[] = new int[res.size()];
        for(int k=0;k<res.size();k++){
            result[k] = res.get(k);
        }
        return result;
    }
}