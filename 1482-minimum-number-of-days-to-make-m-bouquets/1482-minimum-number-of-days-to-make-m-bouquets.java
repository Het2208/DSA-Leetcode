class Solution {
    public boolean possibleOrNot(int[] nums , int day , int m , int k){
        int count = 0;
        int noOfBouquets = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] <= day){
                count++;
            }
            else{
                noOfBouquets += count / k;
                count = 0;
            }
        } 
        noOfBouquets += count / k; // This for last adjecent bloom flowers..
        if(noOfBouquets >= m) return true;
        return false;
    }
    public int minDays(int[] nums, int m, int k) {
        int ans = -1;
        if(nums.length < m * k){
            return -1;
        }
        int low = Arrays.stream(nums).min().getAsInt();
        int high = Arrays.stream(nums).max().getAsInt();
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            boolean res = possibleOrNot(nums , mid , m , k);
            if(res == true){
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