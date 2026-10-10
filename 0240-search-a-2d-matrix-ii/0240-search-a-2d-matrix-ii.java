class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //STAIR CASE APPROACH 
        //there will be only 2 valid indexes to start top right and bottom left [here is the bottom solution]
        int m = matrix.length;
        int n = matrix[0].length;
        int r = m-1;
        int c = 0;
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