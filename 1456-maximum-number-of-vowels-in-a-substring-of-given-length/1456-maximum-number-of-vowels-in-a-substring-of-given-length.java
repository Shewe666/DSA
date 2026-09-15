class Solution {
    public int maxVowels(String s, int k) {
        int windowCount=0;
        for(int i =0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                windowCount++;
            }
        }
        int maxCount = windowCount;
        for( int j=k;j<s.length();j++){
        if(isVowel(s.charAt(j-k))) {//character leaving the window
            windowCount--; 
        }
        if(isVowel(s.charAt(j))){
            windowCount++;
        }
        maxCount = Math.max(maxCount,windowCount);
    }
    return maxCount;
    }

    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
