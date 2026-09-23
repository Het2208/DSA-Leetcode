class Solution {

    static final int MOD = 1_000_000_007;

    public int f(int i, int j, int m, int n, int moves, int[][][] dp) {

        // If we go outside the grid
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 1;
        }

        // No moves left and still inside
        if (moves == 0) {
            return 0;
        }

        if (dp[i][j][moves] != -1) {
            return dp[i][j][moves];
        }

        int up = f(i - 1, j, m, n, moves - 1, dp);
        int down = f(i + 1, j, m, n, moves - 1, dp);
        int left = f(i, j - 1, m, n, moves - 1, dp);
        int right = f(i, j + 1, m, n, moves - 1, dp);

        return dp[i][j][moves] =
            (int)(((long)up + down + left + right) % MOD);
    }

    public int findPaths(int m, int n, int maxMove,
                         int startRow, int startColumn) {

        int[][][] dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return f(startRow, startColumn, m, n, maxMove, dp);
    }
}