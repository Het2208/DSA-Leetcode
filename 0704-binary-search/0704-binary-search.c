int search(int* nums, int n, int target) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            low = mid + 1;   // go right
        }
        else {
            high = mid - 1;  // go left
        }
    }
    return -1;
}
