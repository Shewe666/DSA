class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Space optimization:without dp array
        int n = cost.length;
        int prev2 = 0;
        int prev1 = 0;
        int ans=0;
        for(int i=2;i<=n;i++){
            int onestep=cost[i-1]+prev1;
            int twostep=cost[i-2]+prev2;
            ans=Math.min(onestep,twostep);
            prev2 = prev1;
            prev1=ans;
        }
        return ans;
    }
}