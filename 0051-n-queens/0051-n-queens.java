class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i =0;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> res = new ArrayList<>();
        backTrack(board,0,res);
        return res;
    }
    private void backTrack(char[][] board,int col,List<List<String>> res){
        int n = board.length;
        //base case:
        if(col==n){
            constructRes(board,res);
            return;
        }
        for(int row =0;row<n;row++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                backTrack(board,col+1,res);
                board[row][col]='.';
            }
        }
    }
    private boolean isSafe(char [][] board, int row , int col){
        int n = board.length;
        for(int k =1;k<=col;k++){
            int c = col-k;
            //upper diagnol
            int r = row-k;
            if(r>=0){
                if(board[r][c]=='Q')return false;
            }
            //lower diagnol
            r= row+k;
            if(r<n){
                if(board[r][c]=='Q')return false;
            }
            //same row;
            if(board[row][c]=='Q') return false;
        }
        return true;
    }
    private void constructRes(char board[][], List<List<String>> res){
        int n = board.length;
        List<String> curr = new ArrayList<>();
        for(int i =0;i<n ;i++){
            String s = new String(board[i]);
            curr.add(s);
        }
        res.add(curr);
    }
}