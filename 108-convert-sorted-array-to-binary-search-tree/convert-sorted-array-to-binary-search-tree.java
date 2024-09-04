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
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left=create(nums,left,mid-1);
        node.right=create(nums,mid+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
}