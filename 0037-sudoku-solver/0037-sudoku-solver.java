class Solution {
    public void solveSudoku(char[][] board) {
        //time complexity - 2^81-m where m are the empty cells
        backtrack(board,0,0);
    }
    private boolean backtrack(char[][]board , int row,int col){
        //base case:
        if(col==9){
            col=0;
            row++;
        }
        if(row == 9){
            return true; //successfully filled the whole grid
        }
        if(board[row][col]!='.'){
            return backtrack(board,row,col+1);
        }
        //(1-9)
        for(int d=1;d<=9;d++){
            char digit = (char)(d+'0');
            if(placementPossible(digit,board,row,col)){
                board[row][col]=digit;
                if(backtrack(board,row,col)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    private boolean placementPossible(char digit, char[][]board, int row,int col){
        for(int j=0;j<9;j++){
            //current row 
            if(board[row][j]==digit){
                return false;
            }
            //current colm
            if(board[j][col]==digit){
                return false;
            }
            //same grid
           
            int  r = 3*(row/3 )+ (j/3);//for row;
            int c = 3*(col/3) + (j%3); //for clm
            if(board[r][c]==digit){
                return false;
            }
        }
        return true;
    }
}