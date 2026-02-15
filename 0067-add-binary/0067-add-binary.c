char* addBinary(char* a, char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);

    int maxLen = (lenA > lenB ? lenA : lenB);

    char* result = (char*)malloc(maxLen + 2);

    int i = lenA - 1;
    int j = lenB - 1;
    int k = maxLen + 1;

    result[k--] = '\0';

    int carry = 0;

    while (i >= 0 || j >= 0 || carry) {
        int sum = carry;

        if (i >= 0) sum += a[i--] - '0';
        if (j >= 0) sum += b[j--] - '0';

        result[k--] = (sum % 2) + '0';
        carry = sum / 2;
    }

    memmove(result, result + k + 1, maxLen + 2 - (k + 1));

    return result;
}
