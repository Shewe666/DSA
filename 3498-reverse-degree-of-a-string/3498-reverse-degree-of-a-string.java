class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for( int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = Math.abs(ch-'z');
            sum+=(val+1)*(i+1);
        }
       return sum;
    }
}