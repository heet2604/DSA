Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest product, and return the product.

public class maxproductsubarray {
    public static int pro(int arr[]){
        int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr*arr[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={2,3,-2,4};
        System.out.println(pro(arr));
    }
}
