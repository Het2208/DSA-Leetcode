int missingNumber(int* arr, int n) {
    int total = n * (n+1) / 2;
    for(int i=0 ; i<n ; i++){
        total -= arr[i];
    }
    return total;
}