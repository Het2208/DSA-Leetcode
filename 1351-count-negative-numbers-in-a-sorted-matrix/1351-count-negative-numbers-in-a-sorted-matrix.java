class Solution {
    public int countNegatives(int[][] nums) {
        int negativeCount = 0;
        int cols = nums[0].length;
        int k = cols - 1;

        for(int i=0 ; i<nums.length ; i++){
            while(k >= 0 && nums[i][k] < 0){
                k--;
            }
            negativeCount += (cols - k - 1);
        }
        return negativeCount;
    }
}