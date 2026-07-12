int minimumOperations(int* arr, int n) {
    int steps = 0;
    for(int i=0 ; i<n ; i++){
        if(arr[i] % 3 != 0){
            steps++;
        }
    }
    return steps;
}