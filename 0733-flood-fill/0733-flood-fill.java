class Solution {
    int m;
    int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        int original = image[sr][sc];    
        if(original == color){
            return image;
        }  
        dfs(image,sr,sc,color,original);   
        return image;
    }
    public void dfs( int[][] image, int sr, int sc, int color,int original){
        int[][] adjMat= {
            {sr-1,sc},
            {sr,sc+1},
            {sr+1,sc},
            {sr,sc-1}
        };
        if(sr>=m|| sc>=n || sr<0|| sc<0 || image[sr][sc]!=original){
            return;
        }
        image[sr][sc]=color;
        for(int neighbour[] : adjMat){
            dfs(image,neighbour[0],neighbour[1],color,original);
        }
    }
    }