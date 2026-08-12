class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        HashMap<Integer , Integer> map = new HashMap<>(); 
        while(r < nums.length){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);
            while(map.get(nums[r]) > k){
                map.put(nums[l] , map.get(nums[l]) - 1);
                l++;
            }

            maxLength = Math.max(maxLength , (r - l + 1));
            r++;
        }   
        return maxLength;
    }
}