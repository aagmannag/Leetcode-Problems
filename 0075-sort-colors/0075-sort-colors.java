class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for(int n : nums){
            if(n == 0){
                c0++;
            } else if(n == 1){
                c1++;
            } else{
                c2++;
            }
        }

        int idx = 0;
        while(c0-- > 0){
            nums[idx++] = 0;
        }
        while(c1-- > 0){
            nums[idx++] = 1;
        }
        while(c2-- > 0){
            nums[idx++] = 2;
        }
    }
}