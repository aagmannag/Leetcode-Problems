class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i : nums){
            map.put(i, false);
        }
        int max = 0;
        for(int i : nums){
            int currMax = 1;
            int right = i + 1;
            while(map.containsKey(right) && map.get(right) == false){
                currMax++;
                map.put(right, true);
                right++;
            }
            int left = i - 1;
            while(map.containsKey(left) && map.get(left) == false){
                currMax++;
                map.put(left, true);
                left--;
            }
            max = Math.max(max, currMax);
        }
        return max;
    }
}