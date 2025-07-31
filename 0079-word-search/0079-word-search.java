class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == arr[0] && backtrack(board, i, j, arr, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, int i, int j, char[] word, int idx){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '*' || board[i][j] != word[idx]) return false;

        if(idx == word.length-1) return true;

        char ch = board[i][j];
        board[i][j] = '*';
        boolean res = backtrack(board, i-1, j, word, idx+1)||
            backtrack(board, i, j-1, word, idx+1)||
            backtrack(board, i+1, j, word, idx+1)||
            backtrack(board, i, j+1, word, idx+1);
        board[i][j] = ch;
        return res;
    }
}