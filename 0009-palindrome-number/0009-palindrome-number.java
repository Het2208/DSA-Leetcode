class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x == 0) return true;

        int digitCount = 0;
        int temp = x;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int divisor = (int) Math.pow(10, digitCount - 1);

        while (divisor > 1) {

            int first = x / divisor;
            int last = x % 10;

            if (first != last) {
                return false;
            }

            x = (x % divisor) / 10;
            divisor /= 100;
        }

        return true;
    }
}