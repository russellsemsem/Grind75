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

//bottom up approach: goes to leaf then calculates max as going up as it checks every node
// public class Solution {
//     int max = 0;
    
//     public int diameterOfBinaryTree(TreeNode root) {
//         maxDepth(root);
//         return max;
//     }
    
//     private int maxDepth(TreeNode root) {
//         if (root == null) return 0;
        
//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);
        
//         max = Math.max(max, left + right);
        
//         return Math.max(left, right) + 1;
//     }
// }


//original solution: uses a top down approach that adds the height of both left and right subtree for every node.
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int depthLeft = depthRec(root.left);
        int depthRight = depthRec(root.right);
        int maxPath = depthLeft + depthRight;
        
        if(depthLeft == depthRight){
            return maxPath;
        }
    
        return Math.max(maxPath, 
                        Math.max(diameterOfBinaryTree(root.left)
                                 , diameterOfBinaryTree(root.right)));
        
        
    }
    
    public int depthRec(TreeNode curr){
        if(curr == null){
            return 0;
        }
        return Math.max(depthRec(curr.left), depthRec(curr.right)) + 1;
    }
    
}