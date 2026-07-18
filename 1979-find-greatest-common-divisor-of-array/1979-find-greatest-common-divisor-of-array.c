int findGCD(int* arr, int n) {
    int min = arr[0];
    int max = arr[0];
    for(int i=1 ; i<n ; i++){
        if(arr[i] > max){
            max = arr[i];
            continue;
        }
        if(arr[i] < min) {
            min = arr[i];
            continue;
        }
    }
    int gcd = 0;
    while (min != 0) {
        int temp = min;
        min = max % temp; 
        max = temp;     
    }
    return max;
}