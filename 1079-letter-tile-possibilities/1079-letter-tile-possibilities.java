class Solution {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        List<String>res = new ArrayList<>();
        List<Character>curr = new ArrayList<>();
        boolean visited[] = new boolean[arr.length];
        backtrack(arr,res,curr,visited);
        return res.size();
    }
    private void backtrack(char[] arr,List<String>res, List<Character>curr,boolean [] visited ){
        for(int i =0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            //prevent duplictes condition
            if(i>0 && arr[i]==arr[i-1]&&!visited[i-1]){
                continue;
            }
            visited[i]= true;
            curr.add(arr[i]);
            StringBuilder sb = new StringBuilder();
            for(char ch : curr){
                sb.append(ch);
            }
            res.add(sb.toString());
            backtrack(arr,res,curr,visited);
            //backtrack
            curr.remove(curr.size()-1);
            visited[i]= false;
        }

    }
}