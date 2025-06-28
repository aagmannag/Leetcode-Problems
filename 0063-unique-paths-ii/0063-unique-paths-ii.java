class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            if(obstacleGrid[i][0] == 1){
                break; // all cells after it are automatically unreachable. You cannot cross an obstacle in the same row.
            }else{
                dp[i][0] = 1;
            }
        }
        for(int i = 0; i < m; i++){
            if(obstacleGrid[0][i] == 1){
                break; // all cells after it are automatically unreachable. You cannot cross an obstacle in the same row.
            }else{
                dp[0][i] = 1;
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}