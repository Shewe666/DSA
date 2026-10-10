class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         //first applying the binary logic on rows.
         int m = matrix.length;
         int n = matrix[0].length;

         int top=0,bottom =m-1;
         int row=-1;
         while(top<=bottom){
            int mid = top+(bottom-top)/2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target){
                row = mid;
                break;
            }
            else if(matrix[mid][0]<target){
                top = mid+1;
            }
            else{
                bottom = mid-1;
            }
         }
         if (row == -1) return false;

        //now applying binary logic on the valid row 
        int left =0;
        int right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
    return false;
    }
}