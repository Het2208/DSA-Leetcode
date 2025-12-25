int removeElement(int arr[] , int n , int val){
    int pointer=0;
    for(int i=0 ; i<n ; i++){
        if(arr[i] != val){
            arr[pointer++] = arr[i];
        }
    }
    return pointer;
}