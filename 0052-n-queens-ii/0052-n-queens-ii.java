class Solution {
    public int totalNQueens(int n) {
    char board[][]  = new char[n][n];
    for(int i =0;i<n;i++){
        Arrays.fill(board[i],'.');
    }
    List<List<String>>res = new ArrayList<>();
    backtrack(board,0,res);  
    return res.size();
    }
    private void backtrack(char [][]board,int col,List<List<String>>res){
        int n = board.length;
        if(col==n){
            constructRes(board, res);
            return;
        }
        for(int row = 0;row< n ;row ++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
              backtrack(board,col+1,res);
                board[row][col]='.';
            }
        }
    
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
    private void constructRes(char[][]board, List<List<String>>res){
        List<String>curr = new ArrayList<>();
        for(int i =0;i<board.length;i++){
            String s= new String(board[i]);
            curr.add(s);

        }
        res.add(curr);
    }
}