int longestOnes(int* arr, int n, int k) {
    int left = 0;
    int right = 0;
    int maxLength = 0;
    int zeros = 0;
    while(right < n){
        
        if(arr[right] == 0) zeros++;

        if(zeros > k){
            if(arr[left] == 0) zeros--;
            left++;
        }
        if(zeros <= k){
            int len = right - left + 1;
            if(len > maxLength) maxLength = len;
        }
        right++;
    }
    return maxLength;
}