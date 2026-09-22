class Solution {

    public int f(int i , int j , int m , int n , int[][] grid , int[][] dp){
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1) {
            return Math.max(1, 1 - grid[i][j]);
        }
        if(dp[i][j] != -1) return dp[i][j];

        int down = f(i+1 , j , m , n , grid , dp);
        int right = f(i , j+1 , m , n , grid , dp);
        
        int needed = Math.min(right, down) - grid[i][j];

        return dp[i][j] = Math.max(1, needed);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int dp[][] = new int[m][n];
        for(int[] row : dp) Arrays.fill(row , -1);
        return f(0 , 0 , m , n , dungeon , dp);   
    }
}