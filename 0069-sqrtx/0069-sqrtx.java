class Solution {
    public int mySqrt(int target) {
        if( target == 0 || target == 1){
            return target;
        }
       long left = 1;
       long right = target/2;

       while(left<=right){
        long mid = left+ (right-left)/2;
        long sq = mid*mid;
        if( sq == target){
            return (int)mid;
        }
        if(sq<target){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
       }
       return (int)right;
    }
}