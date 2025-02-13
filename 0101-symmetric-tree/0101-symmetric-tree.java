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
        return same(root.left, root.right);
    }
    private boolean same(TreeNode rootLeft, TreeNode rootRight){
        if(rootLeft == null && rootRight == null) return true;
        if(rootLeft != null && rootRight == null) return false;
        if(rootLeft == null && rootRight != null) return false;
        if(rootLeft.val != rootRight.val) return false;
        boolean l = same(rootLeft.left, rootRight.right);
        boolean r = same(rootLeft.right, rootRight.left);
        return l && r;
    }
}