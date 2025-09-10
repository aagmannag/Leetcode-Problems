class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int countShift = 0;
        while(left < right){
            left = left >> 1;
            right = right >> 1;
            countShift++;
        }
        return left << countShift;
    }
}