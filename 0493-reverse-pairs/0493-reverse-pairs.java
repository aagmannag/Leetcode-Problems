class Solution {
    public int reversePairs(int[] nums) {
        return divide(nums, nums.length);
    }
    public int divide(int[] arr, int n){
        if(n < 2){
            return 0;
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

        int sum = 0;
        sum += divide(leftarr, mid);
        sum += divide(rightarr, n-mid);
        sum += merge(arr, leftarr, rightarr, mid, n-mid);

        return sum;
    }
    public int merge(int[] arr, int[] leftarr, int[] rightarr, int n, int m){
        int sum = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            while(j < m && (long) leftarr[i] > 2L * rightarr[j]){
                j++;
            }
            sum += j;
        }

        int i = 0, k = 0;
        j = 0;
        while(i < n && j < m){
            if(leftarr[i] <= rightarr[j]){
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
        return sum;
    }
}