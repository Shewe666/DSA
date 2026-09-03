class Solution {
    int n ;
    int m;
    public int numIslands(char[][] grid) {
        n=grid.length;
        m = grid[0].length;
       boolean [][] visited = new boolean [n][m];
       int island=0;
       for(int i =0; i<n ;i++){
        for(int j =0;j<m;j++){
            if(grid[i][j]=='1' && !visited[i][j]){
                bfs(i,j,visited,grid);
                island++;
            }
        }
       }
       return island;
     }
    public void bfs(int i , int j , boolean[][] visited , char[][]grid){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        int size = q.size();
        while(!q.isEmpty()){
            int[]curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            int[][] adjlist={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
            for(int[] neighbour :adjlist){
                int nrow=neighbour[0];
                int ncol=neighbour[1];
                if(nrow<0 || nrow>=n || ncol<0||ncol>=m||visited[nrow][ncol]||grid[nrow][ncol]=='0'){
                    continue;
                }
                visited[nrow][ncol]=true;
                q.offer(new int[]{nrow,ncol});
            }
        }
    }
}