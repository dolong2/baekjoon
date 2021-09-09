#include<stdio.h>
#include<stdlib.h>
int one = 0;
int zero = 0;

int check( int **a, int start, int end, int jstart) {
    int q = a[start][jstart];
    for (int i = start; i < end; i++) {
        for (int j = jstart; j < jstart + (end - start); j++) {
            if (a[i][j]!= q) {
                return -1;
            }
          
        }
    }
    return q;
}

void d(int **a, int start, int end, int jstart) {
    int q = check(a, start, end,jstart);
    if (q == 1) {
      one++;
    }
    else if (q == 0) {
        zero++;
    }
    else {
        int len = end - start;
        d(a, start, start + len/2, jstart);
        d(a, start,  start +len/2,  jstart + len/2);
        d(a,  start +len/2 , end, jstart);
        d(a,  start +len/2, end ,  jstart +len/2);
    }
}

int main() {
    int qus;

    scanf("%d", &qus);
    int** a = (int**)malloc(qus * sizeof(int*));
    for (int i = 0; i < qus; i++) {
        a[i] = (int*)malloc(sizeof(int) * qus);
    }
    for (int i = 0; i < qus;i++) {
        for (int j = 0; j < qus;j++) {
            scanf("%d",&a[i][j]);
        }
    }
    d(a, 0, qus, 0);
    
  
    printf("%d\n%d", zero, one);
    for (int i = 0; i < qus; i++) {
        free(a[i]);
    }
    free(a);
}