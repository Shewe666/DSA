import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int index = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            // First 8 letters -> 1 push
            // Next 8 letters -> 2 pushes
            // Next 8 letters -> 3 pushes
            // Remaining -> 4 pushes
            int pushes = (index / 8) + 1;
            ans += freq[i] * pushes;
            index++;
        }
        return ans;
    }
}