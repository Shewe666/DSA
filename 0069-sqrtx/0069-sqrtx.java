class Solution {
    public int mySqrt(int target) {
        long left =1;
        long right = target/2;
        if( target <2){
            return target;
        }
        while(left<=right){
            long mid = left+(right-left)/2;
            long sq = mid*mid; //storing it in long format due to constraints
            if(sq==target){
                return (int) mid;
            }
            if(sq<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    return (int) right;
    }
}