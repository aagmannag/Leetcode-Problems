class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 1) return 1;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int arrows = 1;
        int commonInterval[] = points[0];
        for(int i = 1; i < n; i++){
            int curS = points[i][0];
            int curE = points[i][1];
            // overlap
            if(curS <= commonInterval[1]){
                commonInterval[0] = Math.max(commonInterval[0], curS);
                commonInterval[1] = Math.min(commonInterval[1], curE);
            }else{
                commonInterval[0] = curS;
                commonInterval[1] = curE;
                arrows++;
            }
        }
        return arrows;
    }
}