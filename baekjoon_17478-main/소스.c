#include <stdio.h>
#include<stdlib.h>
char b[] = "\"재귀함수가 뭔가요?\"";
char c1[] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
char c2[] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
char c3[] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
char d[] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
char e[] = "라고 답변하였지.";
void t(int tab) {
    for (int i = 0; i < tab; i++) {
        printf("_");
    }
}

void p(char* a) {
    printf("%s\n", a);
}
void profesor(int n, int tab) {
    t(tab);
    printf("%s\n", b);
    if (n == 1) {
        t(tab);
        printf("%s\n", d);
        t(tab);
        printf("%s\n", e);
    }
    else {
        t(tab);
        printf("%s\n", c1);
        t(tab);
        printf("%s\n", c2);
        t(tab);
        printf("%s\n", c3);
        profesor(n - 1, tab + 4);
        t(tab);
        printf("%s\n", e);
    }
}
int main(void) {
    int n = 3;
    scanf("%d", &n);
    printf("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
    printf("%s\n", b);
    printf("%s\n", c1);
    printf("%s\n", c2);
    printf("%s\n", c3);
    profesor(n, 4);
    printf("%s", e);
}
