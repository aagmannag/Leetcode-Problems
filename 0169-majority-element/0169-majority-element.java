class Solution {
    public int majorityElement(int[] nums) {
        int sum = 0, count = 0;
        for(int i : nums){
            if(count == 0){
                sum = i;
                count++;
            }else if(i == sum){
                count++;
            }else{
                count--;
            }
        }
        return sum;
    }
}