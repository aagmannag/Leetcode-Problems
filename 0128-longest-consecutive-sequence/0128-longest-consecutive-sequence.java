class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int curr = i+1;
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}