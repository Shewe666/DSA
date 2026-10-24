class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       boolean seen[] = new boolean[nums.length];
       permutations(res,curr,seen,nums);
       return res;
    }
    private void permutations(List<List<Integer>> res, List<Integer> curr, boolean seen[] ,int[]nums){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(seen[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !seen[i-1]) continue;
            seen[i]=true;
            curr.add(nums[i]);
            permutations(res,curr,seen,nums);
            curr.remove(curr.size()-1);
            seen[i]=false;
        }
    }
}