class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,k,n,res,curr);
        return res;
    }
    private void backtrack(int start,int k , int n , List<List<Integer>> res ,List<Integer> curr){
        if(curr.size()==k && n==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(n!=0 && curr.size()>k){
            return;
        }
        for( int i =start;i<=9;i++){
        // if(curr.contains(i)){
        //     continue;
        // }
        curr.add(i);
        backtrack(i+1,k,n-i,res,curr);
        curr.remove(curr.size()-1);
        }
    }
}