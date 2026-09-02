class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long degree[] = new long[n];
        for(int edges[]: roads){
            degree[edges[0]]++;
            degree[edges[1]]++;
        }
        Arrays.sort(degree);//increasing order
        long res =0;
        long label =1; //we are starting our label from 1 coz we have sorted our degree array in increasing order.
        for(int i=0;i<degree.length;i++){
            res+=degree[i]*label;
            label++;
        }
        return res;

    }

}