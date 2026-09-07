class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] interval = intervals[0];
        result.add(interval);
        for(int[] i : intervals){
            if(i[0] <= interval[1]){
                interval[1] = Math.max(interval[1], i[1]);
            }else{
                result.add(i);
                interval = i;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}