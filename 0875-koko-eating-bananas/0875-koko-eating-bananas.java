class Solution {

    public int hourCalculation(int  nums[] , int h){
        int hours = 0;
        for(int i=0 ; i<nums.length ; i++){
            hours += Math.ceil((double) nums[i] / h);
        }
        return hours;
    }

    public int minEatingSpeed(int[] nums, int h) {
        int ans = -1;
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low) / 2;
            int totalHours = hourCalculation(nums , mid);
            if(totalHours <= h){
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