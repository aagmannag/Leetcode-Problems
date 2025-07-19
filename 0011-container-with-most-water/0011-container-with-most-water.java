class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while(left < right){
            int s = right - left;
            max = Math.max(max, Math.min(height[left], height[right]) * s);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}