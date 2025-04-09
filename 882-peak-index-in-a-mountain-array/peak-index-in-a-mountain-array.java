class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]>arr[i]){
                continue;
            }
            return i;
        }
        return -1;
    }
}