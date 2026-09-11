class Solution {

    public int robLinear(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);

        dp[0] = nums[0];
        for(int i=1 ; i<n ; i++){
            int pick = nums[i];
            if(i > 1) pick = pick + dp[i-2];
            int notPick = dp[i-1];

            dp[i] = Math.max(pick , notPick); 
        }

        return dp[n-1];
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int[] temp1 = new int[n];
        int[] temp2 = new int[n];
        
        for (int i = 0; i < n - 1; i++) {

            temp1[i] = nums[i + 1];  

            temp2[i] = nums[i];     
        }
        return Math.max(robLinear(temp1) , robLinear(temp2));
    }
}