Given an array arr of positive integers and another number x. 
Determine whether two elements exist in arr whose sum is exactly x or not.
Return a boolean value true if two elements exist in arr else return false.
 
class Solution {                                           //brute force
    boolean hasArrayTwoCandidates(int arr[], int x) { 
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }
}


class Solution {                                            //two pointers
    boolean hasArrayTwoCandidates(int arr[], int x) {
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            int total = arr[left] + arr[right];
            if(total==x){
                return true;
            }
            else if(total>x){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
