class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        return modifiedBinarySearch(nums, target, left, right);
    }
    private int modifiedBinarySearch(int[] arr, int target, int left, int right){
        if(left > right){
            return -1;
        }

        int mid = left + ((right-left) / 2);
        if(arr[mid] == target){
            return mid;
        }
        
        if(arr[mid] >= arr[left]){
            if(arr[left] <= target && target <= arr[mid]){
                return modifiedBinarySearch(arr, target, left, mid - 1);
            }
            else{
                return modifiedBinarySearch(arr, target, mid + 1, right);
            }
        } else{
            if(arr[mid] <= target && target <= arr[right]){
                return modifiedBinarySearch(arr, target, mid+1, right);
            }else{
                return modifiedBinarySearch(arr, target, left, mid - 1);
            }
        }
    }
}