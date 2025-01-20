class Solution {
    public int maximumProduct(int[] nums) {
        int l = nums.length;
        if(l < 3){
            return 0;
        }
        Arrays.sort(nums);

        int product1 = nums[l - 1] * nums[l - 2] * nums[l - 3];
        int product2 = nums[0] * nums[1] * nums[l - 1];
        int ans = Math.max(product1, product2);

        return ans;
    }
}