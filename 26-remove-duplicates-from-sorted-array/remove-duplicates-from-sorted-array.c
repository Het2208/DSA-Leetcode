int removeDuplicates(int arr[], int n) {
    int left=1;
    for(int right=1 ; right<n ; right++){
        if(arr[right] != arr[right - 1]){
            arr[left] = arr[right];
            left++;
        }
    }
    return left;
}