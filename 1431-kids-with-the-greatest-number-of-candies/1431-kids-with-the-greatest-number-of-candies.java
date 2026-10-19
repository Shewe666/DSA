class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        boolean[] res = new boolean[n];
        int max = Integer.MIN_VALUE;
        for( int i =0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                res[i]= true;
            }
            else{
                res[i]=false;
            }
        }
        ArrayList<Boolean>list = new ArrayList<>();
        int size = res.length;
        for( int i =0;i<size;i++){
            list.add(res[i]);
        }
        return list;
    }
}