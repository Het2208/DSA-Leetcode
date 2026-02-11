#include <stdbool.h>

bool isPerfectSquare(int num) {
    if (num < 1) return false;
    
    long left = 1, right = num;
    
    while (left <= right) {
        long mid = left + (right - left) / 2;
        
        if (mid == num / mid && num % mid == 0) {
            return true; 
        }
        else if (mid > num / mid) {
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
    }
    
    return false;
}
