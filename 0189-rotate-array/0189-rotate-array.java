class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k%n; //finding the number of rotations

        reverse(nums,0,n-1);//first reversin' the whole array
        reverse(nums,0,k-1);//reverseing first k-1 
        reverse(nums,k,n-1);//then reversing from k to last element 
    }
    public void reverse( int[]nums,int start,int end){
        while(start<end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

        start++;
        end--;
        }
    }
}