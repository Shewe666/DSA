class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(0,res,curr,candidates,target);
        return res;
    }
    private void backTrack(int index,List<List<Integer>> res,  List<Integer> curr,int[]candidates,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i =index;i<candidates.length;i++){
            if(i==index || candidates[i]!=candidates[i-1]&& (target>=candidates[i])){
                curr.add(candidates[i]);
                backTrack(i+1,res,curr,candidates,target-candidates[i]);
                curr.remove(curr.size()-1);
            }
        }
    }
}