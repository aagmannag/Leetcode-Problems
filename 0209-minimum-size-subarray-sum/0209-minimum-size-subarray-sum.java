class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, currSum = 0, minWindow = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];
            while(currSum >= target){
                minWindow = Math.min(minWindow, right-left+1);
                currSum -= nums[left];
                left++;
            }

        }
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}