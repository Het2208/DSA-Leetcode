double findMaxAverage(int* arr, int n, int k) {
    int sum = 0;
    for(int i=0 ; i<k ; i++){
        sum += arr[i];
    }
    int maxSum = sum;
    for (int i = k; i < n; i++) {
        sum = sum - arr[i - k] + arr[i];
        if (sum > maxSum)
            maxSum = sum;
    }

    return (double)maxSum/k;
}