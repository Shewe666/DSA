class Solution {
    public int totalNQueens(int n) {
    char board[][]  = new char[n][n];
    for(int i =0;i<n;i++){
        Arrays.fill(board[i],'.');
    }
    return backtrack(board,0);  
    }
    private int backtrack(char [][]board,int col){
        int n = board.length;
        if(col==n){
            return 1;
        }
        int count =0;
        for(int row = 0;row< n ;row ++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
               count+= backtrack(board,col+1);
                board[row][col]='.';
            }
        }
    return count;
    }
    private boolean isSafe(char[][]board, int row , int col){
        int n = board.length;
        for(int k =1;k<=col;k++){
            int c = col-k;
            int r = row-k;
            //checking all three conditions ->upper dia, lower dia, left same row 
            if(r>=0){
                if(board[r][c]=='Q') return false;
            }
            r= row+k;
            if(r<n){
                if(board[r][c]=='Q') return false;
            }
            if(board[row][c]=='Q') return false;
        }
        return true;
    }
}