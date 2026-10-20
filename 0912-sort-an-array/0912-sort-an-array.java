class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, nums.length);
        return nums;
    }
    public void divide(int[] arr, int n){
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[n-mid];
        for(int i = 0; i < mid; i++){
            leftarr[i] = arr[i];
        }
        for(int i = 0; i < n-mid; i++){
            rightarr[i] = arr[mid+i]; 
        }
        divide(leftarr, mid);
        divide(rightarr, n-mid);
        merge(arr, leftarr, rightarr, mid, n-mid);
    }
    public void merge(int[] arr, int[] leftarr, int[] rightarr, int n, int m){
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(leftarr[i] < rightarr[j]){
                arr[k++] = leftarr[i++];
            }else{
                arr[k++] = rightarr[j++];
            }
        }
        while(i < n){
            arr[k++] = leftarr[i++];
        }
        while(j < m){
            arr[k++] = rightarr[j++];
        }
    }
} 