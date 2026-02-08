/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int binarysearch(int arr[] , int n , int target , bool leftBais){
    int left = 0;
    int right = n-1;
    int i = -1;
    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] > target){
            right = mid - 1;
        }
        else if(arr[mid] < target){
            left = mid + 1;
        }
        else{
            i = mid;
            if(leftBais){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
    }
    return i;
}

int* searchRange(int* arr, int n, int target, int* returnSize) {
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;
    int left = binarysearch(arr , n , target , true);
    int right = binarysearch(arr , n , target , false);
    result[0] = left;
    result[1] = right;
    return result;
}