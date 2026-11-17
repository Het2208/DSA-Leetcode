class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int jumps = 0;
        int maxi = 0;
        while(r < nums.length - 1){
            maxi = 0;
            for(int i=l ; i<=r ; i++){
                maxi = Math.max(maxi , nums[i] + i);
            }
            l = r + 1;
            r = maxi;
            jumps++;
        }
        return jumps;
    }
}