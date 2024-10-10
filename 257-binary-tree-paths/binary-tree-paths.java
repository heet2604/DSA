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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        dfs(root,arr,"");
        return arr;
    }

    public void dfs(TreeNode root,ArrayList<String> arr,String s){
        if(root==null){
            return ;
        }
        s+=root.val;
        if(root.left==null && root.right==null){
            arr.add(s);
        }
        dfs(root.left,arr,s+"->");
        dfs(root.right,arr,s+"->");
        return;
    }
}