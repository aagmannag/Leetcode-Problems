class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int v = 0; v < nums.length; v++){
            if(nums[v] <= i){
                i = nums[v];
            }else if(nums[v] <= j){
                j = nums[v];
            }else{
                return true;
            }
        }
        return false;
    }
}