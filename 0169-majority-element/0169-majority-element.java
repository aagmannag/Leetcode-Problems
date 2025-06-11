class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int a = 0;
        for(int i : nums){
            if(count == 0){
                a = i;
            }
            if(a == i){
                count++;
            }else{
                count--;
            }
        }
        return a;
    }
}