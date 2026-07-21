int maxScore(int* arr, int n, int k) {
    int leftSum = 0;
    int rightSum = 0;
    int maxSum = 0;
    for(int i=0; i<=k-1 ; i++){
        leftSum += arr[i];
        maxSum = leftSum;
    }
    int rightIndex = n-1;
    for(int i=k-1 ; i>=0 ; i--){
        leftSum -= arr[i];
        rightSum += arr[rightIndex--];
        if(maxSum < (leftSum + rightSum)){
            maxSum = leftSum + rightSum;
        }
    }
    return maxSum;
}