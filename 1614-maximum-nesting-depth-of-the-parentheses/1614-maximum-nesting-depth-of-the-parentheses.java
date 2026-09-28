class Solution {
    public int maxDepth(String s) {
        int count =0;
        int maxCount=Integer.MIN_VALUE;
        for( char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }
            maxCount = Math.max(maxCount,count);
            if(ch ==')'){
                count--;
            }
        }
        return maxCount;
    }
}