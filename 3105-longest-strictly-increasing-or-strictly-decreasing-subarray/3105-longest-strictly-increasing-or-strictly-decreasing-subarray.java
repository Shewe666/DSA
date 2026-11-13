class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int left = 0 ;
        int maxLen= 1;
        //increasing 1 2 3 
        for(int right = 1;right<nums.length;right++){
            if(nums[right]<=nums[right-1]){
                left=right;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        //decreasing 3 2 1 
         left =0;
        for(int right =1; right<nums.length;right++){
            if(nums[right]>=nums[right-1]){
                left = right;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}