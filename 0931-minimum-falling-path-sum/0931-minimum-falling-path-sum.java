class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int j=0 ; j<n ; j++) dp[0][j] = matrix[0][j];

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                int upLeft = Integer.MAX_VALUE;
                int upRight = Integer.MAX_VALUE;
                int up = dp[i-1][j];
                if(j-1 >= 0) upLeft = dp[i-1][j-1];
                if(j+1 < n) upRight = dp[i-1][j+1];

                dp[i][j] = matrix[i][j] + Math.min(up , Math.min(upLeft , upRight));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            min = Math.min(min , dp[n-1][i]);
        }
        return min;
    }
}