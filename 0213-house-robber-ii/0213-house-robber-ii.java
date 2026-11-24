class Solution {
    public int rob(int[] nums) {
        //space optimization
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int nums1[] = new int[n-1];//removing 1st element once
        int nums2[]= new int[n-1]; //removing last element once 
        int j =0;
        int k=0;
        for(int i =0;i<n;i++)
        {
            if(i!=0){
                nums1[j]=nums[i];
                j++;
            }
            if(i!=n-1){
                nums2[k]=nums[i];
                k++;
            }
        }
        return Math.max(rob1(nums1),rob1(nums2));
    
}
private int rob1(int[]nums){
    if(nums.length==1){
        return nums[0];
    }
    int n=nums.length;
    int prev2=0;
    int prev1=nums[0];
    int ans=0;
    for(int i =1;i<n;i++){
        int pick = nums[i]+prev2;
        int noPick = 0+prev1;
        ans = Math.max(pick,noPick);
        prev2=prev1;
        prev1=ans;
    }
    return ans;
 }
}