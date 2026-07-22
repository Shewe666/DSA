class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        // Java requires local variables to be initialized before they're used. therefore we haev innitialized duplicate and missing to -1.
        int duplicate=-1;
        int missing=-1;
        for(int num:nums){
            if(set.contains(num)){
                duplicate=num;
            }
            else{
                set.add(num);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                missing=i;
                break;
            }
        }

        return new int[]{duplicate,missing};
    
    }
}