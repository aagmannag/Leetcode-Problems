class Solution {
    public boolean canJump(int[] nums) {
        int m = 0;

        for(int i = 0; i < nums.length; i++){
            if(i <= m){
                m = Math.max(m, i+nums[i]);
            }
        }
        
        return m >= nums.length-1;
    }
}