class Solution {
    public int longestValidParentheses(String s) {
    //More optimized without using stack 
    int left=0;
    int right=0;
    int max=0;
    for(char ch : s.toCharArray()){
        if(ch=='('){
            left++;
        }
        else if( ch ==')'){
            right++;
        }
        if( left == right){
            max = Math.max(max,left+right);
        }
        else if(right>left){//reinitializinf condition
            right=left=0;
        }      
    }
    left=right=0;
    for( int i=s.length()-1 ;i>=0; i--){
        if(s.charAt(i)=='(')
        left++;
        else right++;
        if(left==right){
        max=Math.max(max,left+right);
        }
        else if(left>right) //reinitializing condiiton
        {
            left=0;
            right=0;
        }
    }
    return max;
    }
    }
