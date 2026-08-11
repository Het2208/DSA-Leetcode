// class Solution {
//     public int mySqrt(int x) {
//         if (x == 0 || x == 1)
//             return x;
//         int low = 1;
//         int high = x;
//         int ans = 1;

//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(mid * mid > x){
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//                 ans = mid;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int low = 1;
        int high = x;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid > x) {
                high = mid - 1;
            } 
            else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}