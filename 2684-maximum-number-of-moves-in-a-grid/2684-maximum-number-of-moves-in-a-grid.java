class Solution {

    public int f(int i , int j , int m , int n , int[][] grid , int[][] dp){
        if(i >= m || i < 0 || j >= n || j < 0) return Integer.MIN_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0; 
        if(i - 1 >= 0 && j + 1 < n && grid[i][j] < grid[i-1][j+1]) ans = Math.max(ans , 1 + f(i-1 , j+1 , m , n , grid , dp));
        if(j + 1 < n && grid[i][j] < grid[i][j+1]) ans = Math.max(ans , 1 + f(i , j+1 , m , n , grid , dp));
        if(i + 1 < m && j + 1 < n && grid[i][j] < grid[i+1][j+1]) ans = Math.max(ans , 1 + f(i+1 , j+1 , m , n , grid , dp));

        return dp[i][j] = ans;
    }

    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int[] row : dp) Arrays.fill(row , -1);
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<m ; i++){
            max = Math.max(max , f(i , 0 , m , n , grid , dp));
        }
        return max;
    }
}