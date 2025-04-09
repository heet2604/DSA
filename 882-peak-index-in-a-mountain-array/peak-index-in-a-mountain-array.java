class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //Non-optimized
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i+1]>arr[i]){
        //         continue;
        //     }
        //     return i;
        // }
        // return -1;

        //Optimized

        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s + (e-s)/2;

            //descending part of the array , this might be an ans but check in left
            if(arr[mid]>arr[mid+1]){
                e = mid;
            }
            else{
                //ascending part of the array
                s = mid+1;  //as we know in ascending arr[i+1] > arr[i]
            }
        }
        // at the end s = e = largest
        return s;

    }
}