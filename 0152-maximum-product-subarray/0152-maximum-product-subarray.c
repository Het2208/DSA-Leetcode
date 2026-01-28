int maxProduct(int* arr, int n) {
    int maxEnding = arr[0];
    int minEnding = arr[0];
    int maxProduct = arr[0];

    for(int i = 1; i < n; i++) {
        if(arr[i] < 0) {
            int temp = maxEnding;
            maxEnding = minEnding;
            minEnding = temp;
        }

        maxEnding = (arr[i] > maxEnding * arr[i]) ? arr[i] : maxEnding * arr[i];
        minEnding = (arr[i] < minEnding * arr[i]) ? arr[i] : minEnding * arr[i];

        if(maxEnding > maxProduct)
            maxProduct = maxEnding;
    }
    return maxProduct;
}
