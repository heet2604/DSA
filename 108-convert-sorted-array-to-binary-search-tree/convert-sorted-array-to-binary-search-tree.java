/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode create(int nums[],int left,int right){
        if(left>right){          //base call (right always > left)
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]); //as the array is sorted the element at the mid position will be the mid as well as the root
        root.left = create(nums,left,mid-1);
        root.right = create(nums,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
}