class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int ans[] = new int[2*n];
        for(int i =0;i<ans.length;i++){
            if(i>nums.length-1){
                ans[i]=nums[i-nums.length];
            }
            else{
            ans[i]=nums[i];
            }
    
        }
        return ans;
    }
}