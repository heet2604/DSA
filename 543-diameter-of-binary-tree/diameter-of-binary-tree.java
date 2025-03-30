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
    int diameter = 0;

    public int diam(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = diam(root.left);
        int right = diam(root.right);
        diameter = Math.max(diameter,left+right);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diam(root);
        return diameter;
    }
}