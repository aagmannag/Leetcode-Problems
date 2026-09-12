class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftmax = 0;
        int rightmax = 0;
        for(int i = 0; i < n; i++){
            leftmax = Math.max(leftmax, height[i]);
            left[i] = leftmax;
        }
        for(int i = n-1; i >= 0; i--){
            rightmax = Math.max(rightmax, height[i]);
            right[i] = rightmax;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.min(left[i], right[i]) - height[i];
        }
        return sum;
    }
}