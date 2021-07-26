#include<iostream>
#include<queue>
using namespace std;
int main() {
    priority_queue<int, vector<int>, greater<int>> a;
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int b;
        for (int i = 0; i < n; i++) {
            scanf("%d", &b);
            a.push(b);
            if (n < a.size())
                a.pop();
        }
    }
    printf("%d", a.top());
}