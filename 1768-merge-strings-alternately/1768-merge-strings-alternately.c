#include <string.h>
char * mergeAlternately(char * word1, char * word2){
    int a = strlen(word1);
    int b = strlen(word2);
    char *res = (char *)malloc(a + b + 1);
    int i=0;
    while(a > 0 && b > 0){
        res[i++] = word1[strlen(word1) - a];
        res[i++] = word2[strlen(word2) - b];
        --a;
        --b;
    }

    while(a > 0){
        res[i++] = word1[strlen(word1) - a];
        --a;
    }

    while(b > 0){
        res[i++] = word2[strlen(word2) - b];
        --b;
    }
    res[i] = '\0';

    return res;
}