int search(int* arr, int n, int target) {
        int left = 0;
    int right = n-1;

    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == target) return mid;

        if(arr[left] <= arr[mid]){
            if(target > arr[mid] || target < arr[left]){
                left =  mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        else{
            if(target < arr[mid] || target > arr[right]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
    }    
    return -1;
}
