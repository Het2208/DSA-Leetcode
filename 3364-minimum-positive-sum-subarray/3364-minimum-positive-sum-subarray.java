class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int len = l; len <= r; len++) {

            int left = 0;
            int right = 0;
            int sum = 0;

            while (right < n) {

                sum += nums.get(right);

                // Window size reached
                if (right - left + 1 == len) {

                    if (sum > 0) {
                        minSum = Math.min(minSum, sum);
                    }

                    // Remove left element
                    sum -= nums.get(left);
                    left++;
                }

                right++;
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}