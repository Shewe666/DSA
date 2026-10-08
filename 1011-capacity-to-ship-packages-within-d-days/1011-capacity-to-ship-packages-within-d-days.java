class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high=0;
        for( int w: weights){
            low = Math.max(low,w);
            high+=w;
        }
        int ans=0;
        while(low<=high){
            int cap = low+(high-low)/2;
            if(canShip(weights,days,cap)){
                ans=cap; //this is the minimum capacity of the ship
                high = cap-1;//if the function return true we need to find the minimum therefore we will fo towards the left side    
            }
            else{
                low = cap+1;
            }
        }
        return ans;
    }
    private boolean canShip(int []weights, int days, int cap){
        int d = 1, curr =0;
        for( int w: weights){
            if(curr+w>cap){
                d++;
                curr=w;
            }else{
                curr+=w;
            }
        }
        return d<=days;
    }
}