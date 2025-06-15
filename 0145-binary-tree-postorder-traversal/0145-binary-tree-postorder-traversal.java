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


// Using 2 Stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>()
        ;
        if(root == null) return ans;
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode store = s1.pop();
            s2.push(store);
            if(store.left != null) s1.push(store.left);
            if(store.right != null) s1.push(store.right);
        }
        while(!s2.isEmpty()){
            TreeNode a = s2.pop();
            ans.add(a.val);
        }
        return ans;
    }
}