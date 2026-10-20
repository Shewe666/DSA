class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsequences(0,res,current,nums);
        return res;
    }
    public void subsequences(int index, List<List<Integer>> res, List<Integer> current , int[]nums){
        //base case:
        if(index==nums.length){
            res.add(new ArrayList<>(current)); //saving the copy of current list 
            return; //returns to the previous function call..
        }
        current.add(nums[index]);
        subsequences(index+1,res,current,nums);

        current.remove(current.size()-1); //removing the last index ..
        subsequences(index+1, res, current, nums);
    }
}