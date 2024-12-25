class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        heapSort(nums);
        return nums;
    }
    private void heapSort(int[] nums){
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxheapify(nums, n, i);
        }
        for(int i = n -1; i > 0; i--){
            swap(nums, 0, i);
            maxheapify(nums, i, 0);
        }
    }
    private void maxheapify(int[] nums, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if(left < n && nums[left] > nums[largest]){
            largest = left;
        }
        if(right < n && nums[right] > nums[largest]){
            largest = right;
        }
        if(largest != i){
            swap(nums, i, largest);
            maxheapify(nums, n, largest);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}