class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinations(1,n,k,res,curr);
        return res;
    }
    private void combinations(int start , int n, int k, List<List<Integer>> res, List<Integer> curr){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i =start;i<=n;i++){ //j-i+1(window size)
            curr.add(i);
            combinations(i+1,n,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}