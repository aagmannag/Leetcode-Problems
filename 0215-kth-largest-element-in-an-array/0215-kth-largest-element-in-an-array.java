class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Queue = new PriorityQueue<>();

        for(int n : nums){
            Queue.add(n);
            if(Queue.size() > k){
                Queue.poll();
            }
        }
        return Queue.peek();
    }
}