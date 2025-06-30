class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, count = 0;
        int n = nums.length-1;
        while(r < n){
            int far = 0;
            for(int i = l; i <= r; i++){
                far = Math.max(far, i+nums[i]);
            }
            l = r + 1;
            r = far;
            count++;
        }
        return count;
    }
}