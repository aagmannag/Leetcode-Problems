class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String,Integer> map=new HashMap<>();
        return solve(nums,target,0,map);
    }
    public int solve(int[] nums,int target,int i,HashMap<String,Integer> map){
        if(target==0 && i==nums.length){
            return 1;
        }
        if(i>=nums.length){
            return 0;
        }
        String key=""+i+"-"+target;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int ans=solve(nums,target-nums[i],i+1,map)+solve(nums,target+nums[i],i+1,map);
        map.put(key,ans);
        return ans;
        //solve(nums,target+nums[i],i+1);
    }
}