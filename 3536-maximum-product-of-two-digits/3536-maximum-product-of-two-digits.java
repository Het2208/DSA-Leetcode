class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int maxProduct = 0;

        while(n != 0){
            int temp = n % 10;
            n /= 10;
            if(temp > max){
                smax = max;
                max = temp;
            }
            else if(temp > smax){
                smax = temp;
            }

        }
        return max * smax;
    }
}