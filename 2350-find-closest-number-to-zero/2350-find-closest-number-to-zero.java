class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE, closestNum = 0;

        for(int i : nums){
            if(Math.abs(i) < min){
                min = Math.abs(i);
                closestNum = i;
            }
            else if(Math.abs(i) == min && i > closestNum){
                closestNum = i;
            }
        }
        return closestNum;
    }
}