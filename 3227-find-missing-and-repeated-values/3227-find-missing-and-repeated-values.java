class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int sq = n*n;
        int arr[] = new int[2];
        int sum1 = 0;
        int set[] = new int[sq+1];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(set[grid[i][j]] != 0){
                    arr[0] = grid[i][j];
                }else{
                    set[grid[i][j]] = 1;
                    sum1 += grid[i][j];
                }
            }
        }
        int sum2 = sq*(sq+1) / 2;
        arr[1] = sum2 - sum1;
        return arr;
    }
}