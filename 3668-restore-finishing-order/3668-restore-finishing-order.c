/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* recoverOrder(int* arr1, int n, int* arr2, int m, int* returnSize) {
    *returnSize = m;

    int* res = (int*)malloc((*returnSize) * sizeof(int));
    int k=0;
    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<m ; j++){
            if(arr1[i] == arr2[j]){
                res[k++] = arr1[i];
            }
        }
    }
    return res;
}