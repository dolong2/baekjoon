#include<iostream>
#include<stack>
#include <string>
using namespace std;
int main() {
    while (true) {
        bool flag = true;
        stack<char> st;
        string str;
        getline(cin,str);
        if (str == ".")
            break;
        for (auto i : str) {
            if (i == '(' || i == '[') {
                st.push(i);
            }
            else if (i == ')') {
                if (!st.empty()&&st.top() == '(') {
                    st.pop();
                }
                else {
                    flag = false;
                    break;
                }
            }
            else if (i == ']') {
                if (!st.empty()&&st.top() == '[') {
                    st.pop();
                }
                else {
                    flag = false;
                    break;
                }
                
            }
        }
        if (flag&&st.empty())
            cout << "yes\n";
        else
            cout << "no\n";
    }
}