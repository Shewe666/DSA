class Solution { 
    public int rob(int[] nums) {
        //top-down memoization
        int []dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return recur(nums,nums.length-1,dp);
    }
    public int recur( int[]nums, int index, int[]dp){
        int n= nums.length;
        //base case
        if(index==0){
            dp[index]=nums[0];
            return dp[index];
        }
        if(index ==-1){
            //out of bound condition
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        //pick no pick 
        int pick= nums[index]+recur(nums,index-2,dp);
        int noPick= 0+recur(nums,index-1,dp);
        dp[index]= Math.max(pick,noPick);
        return dp[index];
    }
}