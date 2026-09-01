class Solution {
    public int findCenter(int[][] edges) {
        //brute force
        int totalEdges = edges.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i =0;i<edges.length;i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.put(v1,map.getOrDefault(v1,0)+1);
            map.put(v2,map.getOrDefault(v2,0)+1);

            if(map.get(v1)==totalEdges){
                return v1;
            }
            if(map.get(v2)==totalEdges){
                return v2;
            }
        }
    return -1;
    }
}