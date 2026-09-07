class Solution {

    public int f(int i , int[] dp){
        if(i == 0) return 1;
        if(i == 1) return 1;

        if(dp[i] != 0) return dp[i];

        int left = f(i - 1 , dp);
        int right = f(i - 2 , dp);

        dp[i] = left + right;

        return dp[i];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return f(n , dp);
    }
}