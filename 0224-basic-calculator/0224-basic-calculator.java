class Solution {
    public int calculate(String s) {
        Stack<Integer>st= new Stack<>();
        int result=0;
        int sign=1;
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
                result+=sign*num;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                result+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                //pushing the prev result and prev sign inside the stack
                st.push(result);
                st.push(sign);
                //fresh start inside the bracket
                result=0;
                sign=1;
            }
            else if(ch==')'){
                result+=sign*num;//processing the last number inside the bracket..
                num=0;
                int prevSign=st.pop();
                int prevResult=st.pop();

                result=prevResult+prevSign*result;

            }
        }
        result+=num*sign;//if there is not bracket at the end 
        return result;

    }
}