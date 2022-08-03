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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        //check heights of left and right subtree to check if current tree
        // is balanced
        if(Math.abs(isBalancedRec(root.left) - isBalancedRec(root.right)) > 1){
            return false;
        }
        
        //check if every subtree is balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int isBalancedRec(TreeNode curr){
        if(curr == null){
            return 0;
        }
        
        return Math.max(isBalancedRec(curr.left), isBalancedRec(curr.right)) + 1;   
    }
}