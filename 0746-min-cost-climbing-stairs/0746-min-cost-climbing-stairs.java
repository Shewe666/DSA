class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //memoization
        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(cost,n,dp);
    }
    private int recur(int []cost , int n ,int[]dp){
        if(n==0 || n ==1){
            dp[n]=0;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int oneStep= cost[n-1]+recur(cost,n-1,dp);
        int twoSteps= cost[n-2]+recur(cost,n-2,dp);
        dp[n]= Math.min(oneStep,twoSteps);
        return dp[n];
    }
}