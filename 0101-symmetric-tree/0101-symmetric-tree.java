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
        return addLeft(root.left, root.right);
    }
    boolean addLeft (TreeNode rootL, TreeNode rootR){
        if(rootL == null && rootR == null) return true;
        if(rootL == null && rootR != null) return false;
        if(rootL != null && rootR == null) return false;
        if(rootL.val != rootR.val) return false;
        boolean l = addLeft(rootL.left, rootR.right);
        boolean r = addLeft(rootL.right, rootR.left);
        return l && r;
    }

}