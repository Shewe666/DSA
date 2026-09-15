class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for( int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        double maxSum=windowSum;
        for( int j=k;j<nums.length;j++){
            windowSum+=nums[j];
            windowSum-=nums[j-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum/k;
    }
}