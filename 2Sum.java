Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

//Brute Force : O(n^2)

  class Solution{
    public static void main(String args[]){
        int nums[]={4,3,2,5};
        int target=5;
        int result[]=twoSum(nums,target);
        if(result!=null){
            System.out.println("(" + result[0] + "," + result[1] + ")");
        }
    }

    public static int[] twoSum(int nums[],int target){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

//Two Pointer Approach O(n) : 
import java.util.ArrayList;

public class twosum{
    public static ArrayList<Integer> sum(int arr[],int target){
        ArrayList<Integer>list = new ArrayList<>();
        int x=0;
        int y=arr.length-1;
        while(x<y){
            if(arr[x]+arr[y]==target){
                list.add(x);
                list.add(y);
                break;
            }
            else if(arr[x]+arr[y]<target){
                x++;
            }
            else{
                y--;
            }
        }
        return list;
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        ArrayList<Integer>list = sum(arr,target);
        System.out.println(list);
    }
}
