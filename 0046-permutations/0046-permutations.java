class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        permutations(nums,current,res);
        return res;

    }
    private void permutations(int [] nums, List<Integer> curr , List<List<Integer>> res){
        //base case:
        if(curr.size()== nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        //loop 
        for(int i =0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue; // skip the particular iteration
            curr.add(nums[i]);
            permutations(nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}