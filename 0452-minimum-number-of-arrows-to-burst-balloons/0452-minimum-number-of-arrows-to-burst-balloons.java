class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 1) return 1;
        Arrays.sort(points, (b, a) -> Integer.compare(b[1], a[1]));
        int arrows = 1;
        int commonEndPoint = points[0][1];
        for(int i = 1; i < n; i++){
            int curS = points[i][0];
            int curE = points[i][1];
            // overlap
            if(curS > commonEndPoint){
                commonEndPoint = curE;
                arrows++;
            }
        }
        return arrows;
    }
}