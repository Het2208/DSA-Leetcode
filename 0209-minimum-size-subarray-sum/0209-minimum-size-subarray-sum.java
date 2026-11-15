class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0;
        int l=0;
        int sum=0;
        int minSize = Integer.MAX_VALUE;

        while(r<nums.length){

            sum+=nums[r];
            while(sum >= target){
                int size = r - l + 1;
                minSize = Math.min(minSize , size);
                sum-=nums[l];
                l++;
            }
            r++;
            
        }
        if(minSize ==  Integer.MAX_VALUE) return 0;
        return minSize;
    }
}