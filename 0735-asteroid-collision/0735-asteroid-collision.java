class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       //optimized approach
       Stack<Integer> st= new Stack<>();
       int n = asteroids.length;
       for(int i =0;i<n;i++){
        int a=asteroids[i];
        while(!st.isEmpty() && st.peek()<-a && st.peek()>0){
            st.pop();
        }
        //condition when a is equal or less thn the less than the st.peek() value;
        if(!st.isEmpty() && a<0 && st.peek()>0){
            if(st.peek()==-a)
            {
                st.pop();
            }
        }
        else{
            st.push(a);
        }
      
       }
       int[] ans= new int[st.size()];
       for(int i=st.size()-1;i>=0;i--){
        ans[i]=st.pop();
       }
       return ans;
    }
}