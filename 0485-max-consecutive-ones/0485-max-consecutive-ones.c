int findMaxConsecutiveOnes(int* arr, int n) {
    int count = 0;
    int maxLength = 0;

    for(int i = 0; i < n; i++){
        if(arr[i] == 1){
            count++;
            if(count > maxLength){
                maxLength = count;
            }
        } else {
            count = 0;
        }
    }

    return maxLength;
}