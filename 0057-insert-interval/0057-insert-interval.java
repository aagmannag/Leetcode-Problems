class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int[] i : intervals){
            // starting which have no overlaps
            if(i[1] < newInterval[0]){
                ans.add(i);
            }
            // For some intervals lying in same block
            else if(i[0] > newInterval[1]){
                ans.add(newInterval);
                newInterval = i;
            }
            // maintain new interval
            else{
                newInterval[0] = Math.min(i[0], newInterval[0]);
                newInterval[1] = Math.max(i[1], newInterval[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}