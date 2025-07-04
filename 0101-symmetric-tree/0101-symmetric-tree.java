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
    public boolean isSymmetric(TreeNode root) {
        return symm(root.left, root.right);
    }
    private boolean symm(TreeNode l, TreeNode r){
        if(l == null && r != null) return false;
        if(l != null && r == null) return false;
        if(l == null && r == null) return true;
        if(l.val != r.val) return false;
        return symm(l.left, r.right) && symm(l.right, r.left); 
    }
}