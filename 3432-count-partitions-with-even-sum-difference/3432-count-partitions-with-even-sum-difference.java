class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int count=0;
        int currentSum=0;
        for(int i=0 ; i<nums.length-1 ; i++){
            currentSum += nums[i];
            if((currentSum - (totalSum - currentSum)) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
