class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > max){
                smax = max;
                max = nums[i];
            }
            else if(nums[i] > smax){
                smax = nums[i];
            }
        }
        return (smax-1) * (max-1);
    }
}