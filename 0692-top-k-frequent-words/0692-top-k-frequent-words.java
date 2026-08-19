class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> li = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String word: words){
        map.put(word, map.getOrDefault(word, 0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }
            return  b.compareTo(a);
    });

        for(String key: map.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int size = pq.size();
        for(int i = 0 ; i <k ; i++){
            li.add(pq.poll());
        }
         li.sort((a, b) -> {

            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }

            return a.compareTo(b);
        });
        return li;
        
    }
}