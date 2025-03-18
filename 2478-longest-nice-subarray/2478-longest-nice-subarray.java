class Solution {
    public int longestNiceSubarray(int[] nums) {
        int bitMask = 0;
        int len = 0;
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            while((bitMask & nums[end]) != 0){
                bitMask = bitMask ^ nums[start];
                start++;
            }
            bitMask = bitMask | nums[end];
            len = Math.max(len, end - start + 1);
        }
        return len;
    }
}