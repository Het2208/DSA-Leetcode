class Solution {

    public int possible(int[] nums , int cap){
        int load = 0;
        int day = 1;
        for(int i=0 ; i<nums.length ; i++){
            if(load + nums[i] > cap){
                day = day + 1;
                load = nums[i];
            }
            else{
                load += nums[i];
            }
        }
        return day;
    }

    public int shipWithinDays(int[] nums, int days) {
        int ans = -1;
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = low + (high - low) / 2;
            int res = possible(nums , mid);
            if(res <= days){
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