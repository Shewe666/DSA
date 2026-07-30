class Solution {
    public String decodeString(String s) {
        Stack<Character> st= new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=']'){
                st.push(ch);
            }
            else{
                StringBuilder sb= new StringBuilder();
                while(st.peek() != '['){
                    sb.insert(0,st.pop());
                }
                st.pop(); // whenever we find an opening bracket we will pop it 
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                //no we need to convert num wwhich is a string to number kyuki utni baar loop chalani hai 
                int repeat=Integer.parseInt(num.toString());
                StringBuilder repeated= new StringBuilder();
                for(int i =0;i<repeat;i++){
                    repeated.append(sb);
                }
                for (char c:repeated.toString().toCharArray()){
                    st.push(c);
                }
            }
        }
        StringBuilder result= new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }
        return result.toString();

    }
}