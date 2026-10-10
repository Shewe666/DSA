class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = m-1;
        int c = 0; //coz we need to start from the last element of each row..
        
        while(r>=0 && c<n){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                r=r-1;
            }
            else{
                c=c+1;
            }
        }
        return false;
    }
}