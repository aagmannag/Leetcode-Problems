class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(nums[min] > nums[i]) min = i;
            if(nums[max] < nums[i]) max = i;
        }
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        int l = max + 1;
        int r = n - min;
        int both = (min + 1) + (n - max);
        return Math.min(l, Math.min(r, both));
    }
}