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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> numbers = new ArrayList<>();
        findNum(root,0,numbers);
        int sum = 0;
        for(int i : numbers){
            sum+=i;
        }
        return sum;
    }

    public static void findNum(TreeNode root,int curr,ArrayList<Integer> numbers){
        if(root==null) return;

        curr = curr*10+root.val;

        if(root.left==null && root.right==null){
            numbers.add(curr);
            return;
        }
        findNum(root.left,curr,numbers);
        findNum(root.right,curr,numbers);
    }
}