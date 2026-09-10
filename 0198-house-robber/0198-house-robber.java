class Solution {

    public int f(int i , int[] nums , int[] dp){
        if(i == 0) return nums[i];
        if(i < 0) return 0;
        if(dp[i] != -1) return dp[i];

        int pick = nums[i] + f(i - 2 , nums , dp);
        int notPick = f(i-1 , nums , dp);

        return dp[i] = Math.max(pick , notPick); 
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return f(n-1 , nums , dp); 
    }
}