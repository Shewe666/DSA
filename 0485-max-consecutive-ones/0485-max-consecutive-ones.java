class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //O[n] time complexity
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}