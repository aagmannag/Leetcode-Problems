class Solution {
    public int maxProduct(int[] nums) {
        int leftmax = 1;
        int rightmax = 1;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            leftmax = ((leftmax == 0)? 1: leftmax) * nums[i];
            rightmax = ((rightmax == 0)? 1: rightmax) * nums[n-i-1];
            max = Math.max(max, Math.max(leftmax, rightmax));  
        }
        return max;
    }
}