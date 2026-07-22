class Solution {
    public String multiply(String num1, String num2) {

        // If either number is 0, answer is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        // Maximum possible digits = m + n
        int[] ans = new int[m + n];
        // Traverse both numbers from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Convert characters to digits
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                // Multiply the two digits
                int mul = digit1 * digit2;
                // Positions where result will be stored
                int p1 = i + j;
                int p2 = i + j + 1;
                // Add current multiplication to existing value
                int sum = mul + ans[p2];
                // Store the last digit
                ans[p2] = sum % 10;
                // Add carry to the previous position
                ans[p1] += sum / 10;
            }
        }
        // Convert array to string
        StringBuilder sb = new StringBuilder();
        // Skip leading zeros
        for (int num : ans) {
            if (sb.length() == 0 && num == 0) {
                continue;
            }
            sb.append(num);
        }
        return sb.toString();
    }
}