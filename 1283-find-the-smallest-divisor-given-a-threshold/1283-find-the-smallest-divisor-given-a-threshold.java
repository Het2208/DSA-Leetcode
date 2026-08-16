class Solution {

    public int sumAfterDivison(int[] nums , int divisor){
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            sum += Math.ceil((double)nums[i] / divisor); 
        }
        return sum;
    } 

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int res = sumAfterDivison(nums , mid);
            if(res <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}