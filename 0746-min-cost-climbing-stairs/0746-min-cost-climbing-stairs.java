class Solution {

    public int f(int i , int[] cost , int[] dp){
        if (i >= cost.length) {
            return 0;
        }

        if(dp[i] != -1) return dp[i];

        int left = f(i + 1 , cost , dp);
        int right = f(i + 2, cost , dp);
        dp[i] = cost[i] + Math.min(left , right);

        return dp[i]; 
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(
            f(0, cost, dp),
            f(1, cost, dp)
        );
    }
}