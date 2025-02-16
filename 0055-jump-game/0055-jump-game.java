class Solution {
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return jump(nums,0,dp);
    }
    public boolean jump(int[] nums,int i,int dp[]){
        if(i==nums.length-1){
            return true;
        }
        if(i>=nums.length){
            return false;
        }
        if(dp[i]!=-1){
            return dp[i]==1?true:false;
        }
        boolean flag=false;
        for(int j=1;j<=nums[i];j++){
            flag=flag || jump(nums,i+j,dp);
        }
        dp[i]=flag?1:0;
        return flag;
    }
}