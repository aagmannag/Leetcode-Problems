class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for (int[] subarray : nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : subarray) {
                set.add(num);
            }
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : map.keySet()) {
            if (map.get(num) == len) {
                result.add(num);
            }
        }

        Collections.sort(result);
        return result;
    }
}