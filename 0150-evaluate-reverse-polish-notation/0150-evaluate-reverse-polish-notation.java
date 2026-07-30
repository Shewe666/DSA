class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
           String t= tokens[i];
            switch(t){
               
                case "+":
                int b1 = st.pop();
                int a1= st.pop();
                st.push(a1+b1);
                break;

                case "-":
                int b2 = st.pop();
                int a2= st.pop();
                st.push(a2-b2);
                break;

                case "*":
                int b3 = st.pop();
                int a3= st.pop();
                st.push(a3*b3);
                break;

                case "/":
                int b4 = st.pop();
                int a4= st.pop();
                st.push(a4/b4);
                break;

                default:
                st.push(Integer.parseInt(t));
                break;
            }
        }
        return st.peek();

    }
}