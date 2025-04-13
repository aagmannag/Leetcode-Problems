class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int left = 1;
        int right = 1;
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[n-i-1];
            m = Math.max(Math.max(left, right), m);
        }
        return m;
    }
}