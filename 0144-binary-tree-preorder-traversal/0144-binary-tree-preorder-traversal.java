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

 class Pair {
    TreeNode node;
    int num;

    Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root, 1));
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if(root == null) return pre;

        while(!s.isEmpty()){
            Pair store = s.pop();

            if(store.num == 1){
                pre.add(store.node.val);
                store.num++;
                s.push(store);

                if(store.node.left != null){
                    s.push(new Pair(store.node.left, 1));
                }
            }
            else if(store.num == 2){
                in.add(store.node.val);
                store.num++;
                s.push(store);

                if(store.node.right != null){
                    s.push(new Pair(store.node.right, 1));
                }
            }
            else{
                post.add(store.node.val);
            }
        }
        return pre;
    }
}