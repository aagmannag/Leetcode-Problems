// Insertion Sort

class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int k = nums[i];
            int j = i - 1;
            
            while(j >= 0 && nums[j] > k){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = k;
        }
        return nums;
    }
}