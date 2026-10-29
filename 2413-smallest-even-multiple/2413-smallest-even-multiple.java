class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            //means n is even so directly we can return n
            return n;
        }
        else{
            return 2*n;
        }

    }
}