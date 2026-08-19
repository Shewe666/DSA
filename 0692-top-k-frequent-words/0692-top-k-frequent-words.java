class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> li = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String word: words){
        map.put(word, map.getOrDefault(word, 0)+1);
        }
        //worst -> best element insert logic in pq
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            // Lower frequency = higher priority to remove
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }
             // lexicographically bigger = higher priority to remove
            return  b.compareTo(a);
    });

        for(String key: map.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int size = pq.size();
      // best -> worst  without sorting , just with the reverse loop
        String[] ans = new String[k];
        for(int i = k-1 ; i >=0; i--){
            ans[i]=pq.poll();
        }
        
        return Arrays.asList(ans);
    }
}