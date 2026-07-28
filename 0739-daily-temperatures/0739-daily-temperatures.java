class Solution {
    public int[] dailyTemperatures(int[] temp) {
    //optimized code 
    int[]ans = new int [temp.length];
    Stack<Integer> st= new Stack<>();
    for(int i=temp.length-1;i>=0;i--){
       int count=1;
        while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
            st.pop();
        }
        if(!st.isEmpty()){
            ans[i]=st.peek()-i;
        }
        st.push(i);
    }
       return ans;
    }
}