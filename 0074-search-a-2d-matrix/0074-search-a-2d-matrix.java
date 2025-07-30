class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchRow(matrix, target);
        if(rowIdx != -1) return BinarySearch(rowIdx, matrix, target);
        else return false;
    }
    private int searchRow(int[][] matrix, int target){
        int low = 0; 
        int high = matrix.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]){
                return mid;
            }
            else if(matrix[mid][0] < target) low = mid+1;
            else high = mid - 1;
        }
        return -1;
    }
    private boolean BinarySearch(int rowIdx, int[][] matrix, int target){
        int low = 0;
        int high = matrix[rowIdx].length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(matrix[rowIdx][mid] == target) return true;
            else if(matrix[rowIdx][mid] < target) low = mid+1;
            else high = mid - 1;
        }
        return false;
    }
}