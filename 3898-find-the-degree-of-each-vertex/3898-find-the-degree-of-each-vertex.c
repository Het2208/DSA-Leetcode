
int* findDegrees(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {

    *returnSize = matrixSize;

    int* result = (int*)calloc(matrixSize, sizeof(int));

    for(int i=0 ; i<matrixSize ; i++)
    {
        for(int j=0 ; j<matrixSize ; j++){
            if(matrix[i][j] == 1){
                result[i] += 1;
            }
        }
    }
    return result;
}