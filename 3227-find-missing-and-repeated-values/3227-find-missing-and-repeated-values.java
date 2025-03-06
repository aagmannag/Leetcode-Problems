class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] = new int[2];
        int sum1 = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    arr[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                    sum1 += grid[i][j];
                }
            }
        }
        int n = grid.length;
        int sq = n*n;
        int sum2 = sq*(sq+1) / 2;
        arr[1] = sum2 - sum1;
        return arr;
    }
}