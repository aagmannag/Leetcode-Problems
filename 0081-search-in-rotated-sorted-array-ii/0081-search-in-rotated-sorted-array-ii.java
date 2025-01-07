class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        return modifiedBinarySearch(nums, target, left, right);
    }
    private boolean modifiedBinarySearch(int[] arr, int target, int left, int right){
        while(left <= right){
            int mid = left + ((right-left) / 2);

            if(arr[mid] == target){
                return true;
            }
        
            if (arr[left] == arr[mid] && arr[right] == arr[mid]) {
                left++;
                right--;
            } 

            else if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 

            else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}