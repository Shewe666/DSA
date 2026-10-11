class Solution {
    public int strStr(String haystack, String needle) {
        //KMP ALGORITHM
        //1.Build lps
       int m = haystack.length();
       int n = needle.length();
       int []lps = new int [n];
       int len =0;
       int i=1;
       while(i<n){
        if(needle.charAt(len)==needle.charAt(i)){
            len++;
            lps[i]=len;
            i++;
        }
        else{
            if(len ==0){
                i++;
            }
            else{
                len = lps[len-1];
            }
        }
       }

       //2.Compare..
       int a=0; //here we will traverse our haystack
       int b=0;//here we will traverse our needle

       while(a<m){
         if(haystack.charAt(a)==needle.charAt(b)){
            a++;
            b++;
            if(b==n){ //whole pattern is matched with the text 
                return a-n; //index of the pattern from where it is starting in the text.
            }
         }
         else{
            if(b==0) a++; //agr hamara j is at 0 toh we cannot come back smartly 
            else b=lps[b-1]; //piche aao and cehck kro ki next potential index konsi hai jispe we can check..

         }

        
       }
       return -1;
    }
}