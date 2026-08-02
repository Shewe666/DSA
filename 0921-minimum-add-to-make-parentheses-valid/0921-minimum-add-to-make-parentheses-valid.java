class Solution {
    public int minAddToMakeValid(String s) {
    //Most optimized without using a stack -> just  using two variable open and closed 
    int open =0;
    int closing =0;
    for(char ch: s.toCharArray()){
        if(ch=='('){
            open++;
        }
        else{
            if(open>0){
                open--;
            }
            else{
                closing++;
            }
        }
    } 
    return open + closing;

    }
}