class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String repeat =s+s;
        repeat = repeat.substring(1,repeat.length()-1);
        if(repeat.contains(s)){
            return true;
        }
        return false;
        
    }
}