class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int prev1 = 2;
        if(n<=2){
            return n;
        }
        for(int i =3; i<=n; i++){
            int temp = prev + prev1;
            prev = prev1;
            prev1= temp;
        }
        return prev1;
    }
}