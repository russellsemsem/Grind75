/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //if root val is between p and q val or equal to p or q return that val
        if(root.val >= p.val && root.val <= q.val){
            return root;
        }
        else if(root.val <= p.val && root.val >= q.val){
            return root;
        }
          
        //if p is greater than root (which implies q is also greater), 
        //go right, else go left
        if(root.val < p.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else {
            return lowestCommonAncestor(root.left, p, q);
        }
    
    }
}