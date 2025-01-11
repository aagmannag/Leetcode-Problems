class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) return nums[0];
        if(n == 1) return (k%2 == 0) ? nums[0] : -1;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < Math.min(n, k-1); i++){
            max = Math.max(max, nums[i]);
        }

        if(k < n){
            max = Math.max(max, nums[k]);
        }
        return max;
    }
}