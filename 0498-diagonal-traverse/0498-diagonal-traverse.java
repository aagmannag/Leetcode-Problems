class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] answer = new int[n * m];
        int col = 0, row = 0;
        for (int i = 0; i < m * n; i++) {
            answer[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1) row++;
                else if (row == 0) col++;
                else {
                    row--;
                    col++;
                }
            } else { 
                if (row == m - 1) col++;
                else if (col == 0) row++;
                else {
                    row++;
                    col--;
                }
            }
        }
        return answer;
    }
}