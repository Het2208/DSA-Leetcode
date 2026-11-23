import java.util.Arrays;

class Solution {

    public boolean f(String s, int i, int count, int[][] dp) {

        if (count < 0) return false;

        if (i == s.length()) {
            return count == 0;
        }

        if (dp[i][count] != -1) {
            return dp[i][count] == 1;
        }

        boolean ans;

        if (s.charAt(i) == '(') {
            ans = f(s, i + 1, count + 1, dp);
        }
        else if (s.charAt(i) == ')') {
            ans = f(s, i + 1, count - 1, dp);
        }
        else {
            ans = f(s, i + 1, count + 1, dp)
                || f(s, i + 1, count - 1, dp)
                || f(s, i + 1, count, dp);
        }

        dp[i][count] = ans ? 1 : 0;

        return ans;
    }

    public boolean checkValidString(String s) {

        int n = s.length();

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(s, 0, 0, dp);
    }
}