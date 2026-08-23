class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int store = -1, max = 0;
        for(int i = n-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                store = i-1;
                break;
            }
        }
        if(store > -1){
            for(int i = n-1; i > store; i--){
                if(nums[i] > nums[store]){
                    max = i;
                    break;
                }
            }
            int temp = nums[store];
            nums[store] = nums[max];
            nums[max] = temp;
        }
        int s = store+1, e = n-1;
        if(store == -1){
            s = 0;
        }
        while(s <= e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}   