class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr = 0;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] < nums[i]){
                sum += nums[i];
            }else{
                curr = Math.max(curr, sum);
                sum = nums[i];
            }
        }
        return Math.max(curr, sum);
    }
}