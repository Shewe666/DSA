class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //tabulation
        int n = cost.length;
        int dp[] = new int[n+1];
        //base case 
        dp[0]=0;
        dp[1]=0;
        for(int state = 2;state<=n;state++){
            int onestep = cost[state-1]+dp[state-1];
            int twostep = cost[state-2]+dp[state-2];
            dp[state]= Math.min(onestep,twostep);

        }
    return dp[n];
    }
    // private int recur(int []cost , int n ,int[]dp){
    //     if(n==0 || n ==1){
    //         dp[n]=0;
    //         return dp[n];
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     int oneStep= cost[n-1]+recur(cost,n-1,dp);
    //     int twoSteps= cost[n-2]+recur(cost,n-2,dp);
    //     dp[n]= Math.min(oneStep,twoSteps);
    //     return dp[n];
    // }
}