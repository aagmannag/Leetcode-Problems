class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n*(n-1) / 2;
        long goodPairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int val = nums[i] - i;
            goodPairs += map.getOrDefault(val, 0);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return totalPairs - goodPairs;
    }
}