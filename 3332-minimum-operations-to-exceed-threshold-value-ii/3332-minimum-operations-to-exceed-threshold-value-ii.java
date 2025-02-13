class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            if(i < k){
                pq.add(i);
            }
        }
        int count = 0;
        long x, y;
        while(!pq.isEmpty()){
            count++;
            x = pq.poll();
            if(pq.isEmpty()) break;
            y = pq.poll();
            long val = (long) x * 2 + y;
            if(val < k){
                pq.add((int)val);
            }
        }
        return count;
    }
}