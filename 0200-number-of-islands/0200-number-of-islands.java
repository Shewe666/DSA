class Solution {
    int m ;
    int n ;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m= grid[0].length;
        int islands=0;
        boolean visited[][] = new boolean[n][m];

        for( int i =0;i <n; i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    islands++;
                }
            }
        }
        return islands;

    }
    public void dfs(int i,int j,char grid[][] , boolean visited[][]){
        //out of bound condition and other base condition that we need to skip :
        if(i<0 || i>=n || j<0 ||j>=m||grid[i][j] =='0'||visited[i][j]){
            return;
        }
        visited[i][j]=true;
        int adjlist[][]={{i-1,j},{i,j+1},{i+1,j},{i,j-1}};
        for(int neighbour[]: adjlist){
            dfs(neighbour[0],neighbour[1],grid,visited);
        }


    }
}