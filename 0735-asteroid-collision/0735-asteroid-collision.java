class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //brute approach..
        ArrayList<Integer> list= new ArrayList<>();
        for(int num:asteroids){
            list.add(num);
        }
        int i=0;
        while(i<list.size()-1)//-1 coz we will run till i+1 
        {
            int a=list.get(i);
            int b=list.get(i+1);
            if(a>0 && b<0){
                //three conditions to check
                if(a>-b){
                    list.remove(i+1);
                }
                else if(a<-b){
                    list.remove(i);
                    if(i>0){
                    i--;
                    }
                }
                else{
                    list.remove(i+1);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }
            }
            else{
                i++;
            }
        }
        
        int[]ans=new int[list.size()];
        for(int j =0;j<list.size();j++){
            ans[j]=list.get(j);
        }
        return ans;
    }
}