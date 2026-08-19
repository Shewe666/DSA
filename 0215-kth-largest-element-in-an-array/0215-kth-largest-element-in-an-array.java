class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int num: nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int [] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i]=pq.poll();
        }
        int max = res[0];
        int smax=res[0];
        for(int i = 0 ; i < k ; i++){
            if(res[i]>max){
                max = res[i];
            }
           else if( res[i]<max &&  res[i]>smax){
            smax = res[i];
           }
        }
        return smax;
   }
}
