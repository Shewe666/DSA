class Solution {
    public String longestPrefix(String s) {
        String prefix ="";
        String longpref="";
        for( int i =0;i<s.length()-1;i++){
            prefix+=s.charAt(i);
            if( s.endsWith(prefix)){
                longpref=prefix;
            }
        }
        return longpref;
       
    }
}