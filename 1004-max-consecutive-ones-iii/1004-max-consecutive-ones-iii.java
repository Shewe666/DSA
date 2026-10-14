class Solution {
    public int longestOnes(int[] nums, int k) {
        //better approach o(2n) .. left and rught pointer both in the worst case will travel n length and no ne will come back again 
        int left =0;
        int zeroCount = 0;
        int maxlength =0;
        for( int right=0;right<nums.length;right++){
            if(nums[right]==0){//expanding phase
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;//shrinking phase
            }
         maxlength = Math.max(maxlength , right - left +1);
            
        }
        return maxlength;
    }
}