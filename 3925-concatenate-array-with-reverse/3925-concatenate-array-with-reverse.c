int* concatWithReverse(int* arr, int n, int* returnSize) {
    *returnSize = 2 * n;

    int* res = (int*)malloc((*returnSize) * sizeof(int));

    

    for(int i=0 ; i<n ; i++){
        res[i] = arr[i];
        res[2*n-i-1] = arr[i];
    }

    return res;
}