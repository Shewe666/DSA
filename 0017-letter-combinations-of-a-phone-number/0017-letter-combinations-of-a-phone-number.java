class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        List<String> res = new ArrayList<>();
        String curr = "";
        backTrack(0, res, new StringBuilder(""), map,digits);
        return res;
    }
    private void backTrack(int index, List<String> res, StringBuilder curr,HashMap<Character, String> map,String digits){
        if(index == digits.length()){
            res.add(curr.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for(int i =0; i < letters.length();i++){
            curr.append(letters.charAt(i)); //include 
            backTrack(index+1, res, curr, map, digits);
            curr.deleteCharAt(curr.length()-1); //remove the last letter and back track "ad"-> curr->"a"; 
        }


    }
}
