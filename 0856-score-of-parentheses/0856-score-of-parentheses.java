class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        st.push(0); //pushing the initial zero for thr prev value 
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }
            else{
               int val=st.pop();
               int Score = (Math.max(2*val,1));
               st.push(Score+st.pop()); //current score + prev value 
            }
        }
        return st.pop();
    }
}