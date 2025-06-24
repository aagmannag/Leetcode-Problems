class Solution {
    public boolean canJump(int[] nums) {
        int finalPos = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= finalPos){
                finalPos = i;
            }
        }
        if(finalPos == 0) return true;
        return false;
    }
}