class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>(); //here if we use while(n>0) it might give us tle it will stuck in an infinite loop
       while(!set.contains(n)){
        set.add(n);
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n=n/10;
           
        }
        if(sum==1){
            return true;
        }
        n=sum;
       }
        return false;
    }
}