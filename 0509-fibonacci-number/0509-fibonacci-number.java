class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(dp,n);
    }
    public int recursion(int[]dp, int n){
        //base case:
        if(n<=1){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1){//already visited
            return dp[n];
        }
        dp[n]= recursion(dp,n-1)+ recursion(dp,n-2);
        return dp[n];
    }
}