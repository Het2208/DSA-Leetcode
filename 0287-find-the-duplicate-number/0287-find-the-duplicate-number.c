int findDuplicate(int* arr, int size) {
    int slow = arr[0];
    int fast = arr[arr[0]];

    while (slow != fast) {
        slow = arr[slow];
        fast = arr[arr[fast]];
    }

    slow = 0;
    while (slow != fast) {
        slow = arr[slow];
        fast = arr[fast];
    }

    return slow;
}