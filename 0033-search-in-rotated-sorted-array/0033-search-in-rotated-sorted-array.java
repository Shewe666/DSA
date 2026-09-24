class Solution {
    public int search(int[] nums, int target) {
        //we need to find the left sorted part and the right sorted part 
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[mid]>=nums[left]){ //left half sorted..
                if(target<=nums[mid] && target>=nums[left]){
                    right = mid -1;
                }
                else{
                    left = mid+1;
                }
            }
             else { //right half sorted..
                if(target>=nums[mid] && target<=nums[right]){
                    left = mid +1;
                }
                else{
                    right= mid-1;
                }
            }
        }
        return -1;
    }
}