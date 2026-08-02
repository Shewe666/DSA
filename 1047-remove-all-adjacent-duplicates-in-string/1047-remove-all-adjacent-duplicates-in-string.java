class Solution {
    public String removeDuplicates(String s) {
    //more optimized approach using a stringBuilder without using stck 
    StringBuilder sb =  new StringBuilder();
    for(char ch : s.toCharArray()){
        int len= sb.length();
        if(len>0 && sb.charAt(len-1)==ch){
            sb.deleteCharAt(len-1);
        }
        else{
            sb.append(ch);
        }
        
    }
    return sb.toString();
    }
}