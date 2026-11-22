class Solution {
    public int climbStairs(int n) {
        //Memoization 
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return recur(dp,n);
    }
    private int recur(int[]dp, int n){
        //base case:
        if(n<=2){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=recur(dp,n-1)+ recur(dp,n-2);
        return dp[n];
    }
}