class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinations(0,res,curr,candidates,target);
        return res;
    }
    private void combinations(int index,  List<List<Integer>> res, List<Integer> curr ,int[] candidates,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(index == candidates.length){
            return;
        }
        //pick
        if(candidates[index]<=target){
            curr.add(candidates[index]);
            combinations(index,res,curr,candidates,target-candidates[index]);
            //backtrack 
            curr.remove(curr.size()-1);
        }
        //nopick
        combinations(index+1,res,curr,candidates,target);
    }
}