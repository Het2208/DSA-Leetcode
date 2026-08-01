class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarrayWithOddLessEqual(nums, k)
             - subarrayWithOddLessEqual(nums, k - 1);
    }

    int subarrayWithOddLessEqual(int[] nums, int goal) {

        if (goal < 0)
            return 0;

        int l = 0;
        int sum = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r] % 2;        

            while (sum > goal) {
                sum -= nums[l] % 2;    
                l++;
            }

            count += (r - l + 1);
        }

        return count;
    }
}