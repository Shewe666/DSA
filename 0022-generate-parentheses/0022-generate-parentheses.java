class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> res = new ArrayList<>();
       backtrack(0,0,res, n , new StringBuilder(""));
       return res;
    }
    private void backtrack(int open ,int close, List<String> res ,int n, StringBuilder str){
        if(open == n && close == n){
            res.add(str.toString());
            return; // tot he prev function call..
        }
        if(open<n){
            str.append('(');
            backtrack(open+1,close,res,n,str);
            str.deleteCharAt(str.length()-1);
        }
        if(close<n && close <open){
            str.append(')');
            backtrack(open,close+1,res,n,str);
            str.deleteCharAt(str.length()-1);
        }
        
    }
}