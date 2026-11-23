class Solution { 
    public int rob(int[] nums) {
        //space optimization
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int prev1=0;
        int prev2=nums[0];
        int ans =0;
        for(int state = 1;state<n;state++){
            int pick=nums[state]+prev1;
            int noPick =0+ prev2;
            ans = Math.max(pick,noPick);
            prev1=prev2;
            prev2=ans;
        }
        return ans;
    }
}