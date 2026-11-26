class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(res,sb,0,0,n);
        return res;
    }
    private void backtrack(List<String>res, StringBuilder sb, int open, int close,int n){
        //base case 
        if(open == n && close==n){
            res.add(sb.toString());
            return;//returning to the last/prev function call
        }
        if(open<n){
            sb.append('(');
            backtrack(res,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1); // undo;
        }//when the first if codition executes fully till the undo operation second if will executes
        if(close<open && close<n){
            sb.append(')');
            backtrack(res,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);//undo
        }
    }
}