Given an array arr of positive integers and another number x. Determine whether two elements exist in arr whose sum is exactly x or not. Return a boolean value true if two elements exist in arr else return false.
 
class Solution {                                     //brute force
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
