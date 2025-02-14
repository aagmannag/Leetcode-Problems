class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        for (; i < n; i++) {
            nums[i] = 0;
        }
    }
}
