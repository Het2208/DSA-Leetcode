int maxSubArray(int* arr, int n) {
    int maxSum = arr[0];
    int currSum = 0;
    for(int i=0 ; i<n ; i++){
        if(currSum < 0) currSum = 0;
        currSum += arr[i];
        if(currSum > maxSum) maxSum = currSum;
    }   
    return maxSum;
}