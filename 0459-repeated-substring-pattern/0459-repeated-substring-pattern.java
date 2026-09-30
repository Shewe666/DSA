class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String repeated = s+s; //string concatention..
       repeated = repeated.substring(1,repeated.length()-1);
       if(repeated.contains(s)){
        return true;
       }
        return false;
    }
}