class Solution {
    int n ;
    int m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m= grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int island=0;
        for(int i =0; i<n;i++){
            for(int j =0;j<m ;j++){
                if( grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,visited,grid);
                    island++;
                }
            }
        }
        return island;

    }
    public void dfs(int i , int j , boolean[][] visited, char[][]grid){
        //base case -<out of bound and other conditions
        if(i<0 || i>=n||j<0||j>=m ||grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        //for neighboours //up //right //down ..left
        int [][]adjlist= {{i-1,j},{i,j+1},{i+1,j},{i,j-1}};
        for(int neighbour[]: adjlist){
            dfs(neighbour[0],neighbour[1],visited,grid);
        }
     }
}