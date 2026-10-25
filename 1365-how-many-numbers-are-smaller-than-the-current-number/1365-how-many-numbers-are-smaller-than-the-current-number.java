class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //optimized codee
        int [] sorted= nums.clone(); // because we need to return the original order not the sorted one
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<sorted.length;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
            }
        }
    int ans[]= new int[nums.length];
    for(int i =0;i<nums.length;i++){
        ans[i]=map.get(nums[i]);
    }
    return ans;
    }
}