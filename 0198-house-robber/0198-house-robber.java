class Solution { 
    public int rob(int[] nums) {
        //space optimization
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int prev2=0;
        int prev1=nums[0];
        int ans =0;
        for(int state = 1;state<n;state++){
            int pick=nums[state]+prev2;
            int noPick =0+ prev1;
            ans = Math.max(pick,noPick);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}