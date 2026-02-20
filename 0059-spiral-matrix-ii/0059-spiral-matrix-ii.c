#include <stdlib.h>

int** generateMatrix(int n, int* returnSize, int** returnColumnSizes) {
    *returnSize = n;

    *returnColumnSizes = (int*)malloc(n * sizeof(int));
    
    int** mat = (int**)malloc(n * sizeof(int*));
    for(int i = 0; i < n; i++) {
        mat[i] = (int*)malloc(n * sizeof(int));
        (*returnColumnSizes)[i] = n;
    }

    int left = 0, right = n - 1;
    int top = 0, bottom = n - 1;
    int value = 1;

    while(left <= right && top <= bottom) {
        
        for(int c = left; c <= right; c++)
            mat[top][c] = value++;
        top++;

        for(int r = top; r <= bottom; r++)
            mat[r][right] = value++;
        right--;

        if(top <= bottom) {
            for(int c = right; c >= left; c--)
                mat[bottom][c] = value++;
            bottom--;
        }

        if(left <= right) {
            for(int r = bottom; r >= top; r--)
                mat[r][left] = value++;
            left++;
        }
    }

    return mat;
}