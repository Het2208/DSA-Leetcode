void moveZeroes(int arr[] , int n){
    int insertPosition = 0;
    for(int i=0 ; i<n ; i++){
        if(arr[i] != 0){
            arr[insertPosition++] = arr[i];
        }
    }

    while(insertPosition<n){
        arr[insertPosition++] = 0;
    }

    printf("Array after move zeros : ");
    for(int i=0 ; i<n ; i++){
        printf("%d ",arr[i]);
    }
}