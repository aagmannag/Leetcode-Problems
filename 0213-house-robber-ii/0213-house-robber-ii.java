class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] left = new int[n-1];
        int[] right = new int[n-1];

        for(int i = 0; i < n-1; i++){
            left[i] = nums[i];
            right[i] = nums[i+1];
        }

        int leftMax = robHouse(left);
        int rightMax = robHouse(right);

        return Math.max(leftMax, rightMax);
    }
    public static int robHouse(int[] house){
        int n = house.length;
        if(n == 1) return house[0];
        if(house[0] > house[1]) {
            house[1] = house[0];
        }
        for(int i = 2; i < n; i++){
            house[i] = Math.max(house[i] + house[i-2], house[i-1]);
        }
        return house[n-1];
    }
}