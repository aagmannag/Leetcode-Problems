class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int i: nums){
            sum += i;
            int store = sum - k;
            if(map.containsKey(store)){
                count += map.get(store);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}