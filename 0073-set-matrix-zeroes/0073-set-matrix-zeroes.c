void setZeroes(int** arr, int n, int* m) {

    int cols = m[0];
    bool firstRow = false;
    bool firstCol = false;

    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<cols ; j++){
            if(arr[i][j] == 0){
                if(i == 0) firstRow = true;
                if(j == 0) firstCol = true;
                arr[0][j] = 0;
                arr[i][0] = 0;
            }
        }
    }

    for(int i=1 ; i<n ; i++){
        for(int j=1 ; j<cols ; j++){
            if(arr[i][0] == 0 || arr[0][j] == 0){
                arr[i][j] = 0;
            }
        }
    }

    if(firstRow){
        for(int j=0 ; j<cols ; j++){
            arr[0][j] = 0;
        }
    }
    if(firstCol){
        for(int i=0 ; i<n ; i++){
            arr[i][0] = 0;
        }
    }
}