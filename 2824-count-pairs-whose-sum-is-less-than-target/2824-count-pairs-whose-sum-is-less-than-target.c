#include<stdlib.h>
int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int countPairs(int* arr, int n, int target) {
    qsort(arr, n, sizeof(int), compare);

    int left = 0;
    int right = n - 1;
    int count = 0;

    while (left < right) {
        if (arr[left] + arr[right] < target) {
            count += (right - left);
            left++;
        } else {
            right--;
        }
    }

    return count;
}