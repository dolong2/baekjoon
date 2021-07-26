#include <iostream>
#include<stdio.h>
#include<vector>
#include<stack>
using namespace std;
int main() {
    stack<int> stack;
    vector<int> result;

    int input[1000000], a;
    scanf("%d", &a);

    for (int i = 0; i < a; i++)
        scanf("%d", &input[i]);

    stack.push(-1);


    for (int i = a - 1; i >= 0; i--) {
        if (input[i] < stack.top())
            result.push_back(stack.top());
        else {
            while (stack.top() != -1 && input[i] >= stack.top()) {
                stack.pop();
            }
            if (stack.top() == -1)
                result.push_back(-1);
            else if (input[i] < stack.top())
                result.push_back(stack.top());
        }
        stack.push(input[i]);
    }

    for (int i = result.size() - 1; i >= 0; i--) {
        printf("%d ", result[i]);
    }
    printf("\n");
}