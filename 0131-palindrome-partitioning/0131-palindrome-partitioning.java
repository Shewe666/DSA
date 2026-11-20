
class Solution {
  
    public List<List<String>> partition(String s) {
    List<List<String>> res = new ArrayList<>();
    List<String> curr = new ArrayList<>();
        solve(0, s,res,curr);
        return res;
    }

    void solve(int partIndex, String s,List<List<String>> res,List<String> curr ) {
        if (partIndex  == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int end = partIndex; end < s.length(); end++) {
            String sub = s.substring(partIndex, end+1);//upper bound exclusive
            if (isPalindrome(sub)) {
                curr.add(sub);
                solve(end+1, s,res,curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
