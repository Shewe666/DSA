class Solution {
    public int findMinArrowShots(int[][] points) {
       int n = points.length;
       int count=1;
       Arrays.sort(points,(a,b)->a[1]<=b[1]?-1:1);
       int lastVal = points[0][1];
       for(int i =1;i< n ;i++){
        if(points[i][0]>lastVal){
            count++;
             lastVal=points[i][1];
        }
       }
       return count;   
    }
}