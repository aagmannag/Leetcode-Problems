// using 1 stack

// TC = O(2N)
// SC = O(N)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    stack.pop();
                    ans.add(peekNode.val);
                    lastVisited = peekNode;
                }
            }
        }

        return ans;
    }
}
