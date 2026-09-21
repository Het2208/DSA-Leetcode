class Solution {
    public int f(int i , int j , int n , int[][] matrix , int[][] dp){
        if(j < 0 || j >= n) return Integer.MAX_VALUE;
        
        if(i == 0) return matrix[0][j];
        if(dp[i][j] != -1) return dp[i][j];
        
        int min = Integer.MAX_VALUE;
        for(int k=0 ; k<n ; k++){
            if(k == j) continue;
            min = Math.min(min , f(i-1 , k , n , matrix , dp));
        }
        return dp[i][j] = matrix[i][j] + min;
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int[] row : dp) Arrays.fill(row , -1);
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++){
            min = Math.min(min , f(n-1 , i , n , matrix , dp));
        }
        return min;
    }
}