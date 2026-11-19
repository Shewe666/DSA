class Solution {
    public void solveSudoku(char[][] board) {

        backtrack(board, 0, 0);
    }
    public boolean backtrack( char[][]board , int row, int col){
        if(col== 9){
            row=row+1;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
           return backtrack(board, row, col+1);
        }
        for(int d =1;d<=9;d++){
            char digit= (char)(d+'0');
            if(placementPossible(digit,row,col,board)){
                board[row][col]=digit;
                if(backtrack(board, row,col)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    private boolean placementPossible(char digit,int row,int col,char[][]board){
        //current row
        //current col
        //grid
        for(int j =0;j<9;j++){
            if(board[row][j]==digit) return false;
            if(board[j][col]==digit)return false;
            int r = 3*(row/3)+(j/3);
            int c = 3*(col/3)+(j%3);
            if(board[r][c]==digit)return false;
        }
        return true;
    }
}