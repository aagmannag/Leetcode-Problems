class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 1, right = n - 2;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            // On left half
            // (even, odd) -> Element is on right half, eliminate the left half.
            else if((mid % 2 == 1 && nums[mid-1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                left = mid+1;
            }
            // On right half
            // (odd, even) -> Element is on the left half, eliminate the right half. 
            else right = mid-1;
        }
        return 0;
    }
}