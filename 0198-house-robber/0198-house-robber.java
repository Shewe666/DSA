class Solution { 
    public int rob(int[] nums) {
        // tabulation -bottom up 
        int n = nums.length;
        int []dp= new int[n+1];//handling the out of bound case
        dp[1]=nums[0]; 
        dp[0]=0; // index == -1 return 0
       for(int state = 2;state<=n;state++){
            int pick=nums[state-1]+dp[state-2];
            int noPick = 0+dp[state-1];
            dp[state]=Math.max(pick,noPick);
        }
        return dp[n];
    }
}