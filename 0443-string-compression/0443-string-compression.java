class Solution {
    public int compress(char[] chars) {
        char read=0;
        char write =0;
        while(read<chars.length){
            char current=chars[read];
            int count=0;
            while(read<chars.length && chars[read]==current){
                count++;
                read++;
            }
            chars[write]=current;
            write++;

            if(count>1){
               String str=String.valueOf(count);
                for(char ch: str.toCharArray()){
                    chars[write]=ch;
                    write++;
                }

            }
        }
        return write;
    }
}