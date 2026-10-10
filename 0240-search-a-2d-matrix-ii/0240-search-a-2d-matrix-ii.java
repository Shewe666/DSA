class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n-1; //coz we need to start from the last element of each row..
        
        while(r<m && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c=c-1;
            }
            else{
                r=r+1;
            }
        }
        return false;
    }
}