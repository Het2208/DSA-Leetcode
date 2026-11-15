class Solution {

    public boolean f(int i, int[] arr, int target, int[][] dp) {

        if (target == 0) return true;

        if (i == 0) return arr[0] == target;

        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        boolean notTake = f(i - 1, arr, target, dp);

        boolean take = false;

        if (arr[i] <= target) {
            take = f(i - 1, arr, target - arr[i], dp);
        }

        dp[i][target] = (take || notTake) ? 1 : 0;

        return take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int totalSum = Arrays.stream(nums).sum();
        if(totalSum % 2 == 1) return false;
        int target = totalSum / 2;

        int[][] dp = new int[n][target + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(n-1 , nums , target , dp);

    }
}