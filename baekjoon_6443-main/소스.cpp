#include<iostream>
#include<algorithm>
using namespace std;



void anagram(string a, int start, int end) {
    if (start == end - 1) {
        cout << a << '\n';
        return;
    }
    for (int i = start; i < end; i++) {
        if (i != start and a.at(i) == a.at(start)) {
            continue; // i가 시작도 아닌데 start랑 같으면 안함
        } //중복 제거

        if (a.at(i) != a.at(start)) {
            char temp = a.at(i);
            a.at(i) = a.at(start);
            a.at(start) = temp;
        } // i랑 start랑 같을때는 굳이 안 바꿈
        anagram(a, start + 1, end);
    }
}

int main() {
    string a;
    int n;
    string z;
    cin >> n;
    getline(cin, z);
    for (int i = 0; i < n; i++) {
        getline(cin, a);
        sort(a.begin(), a.end());
        anagram(a, 0, a.size());
    }
}