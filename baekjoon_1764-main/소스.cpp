#include<iostream>
#include<vector>
#include<algorithm>
#include<cstring>
using namespace std;
string nohear[500001];
bool check(char* b, int n) {
    int start = 0;
    int end = n - 1;
    int mid;
    while (start <= end) {
        mid = (start + end) / 2;
        if (nohear[mid] == b)return true;
        else if (nohear[mid] < b)start = mid + 1;
        else end = mid - 1;
    }
    return false;
}
int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    vector<string> nohearandsee;
    for (int i = 0; i < n; i++) {
        cin >> nohear[i];
    }
    sort(nohear, nohear + n);
    for (int j = 0; j < m; j++) {
        char nosee[21];
        scanf("%s", nosee);
        if (check(nosee, n))
            nohearandsee.push_back(nosee);
    }
    printf("%ld\n", nohearandsee.size());
    sort(nohearandsee.begin(), nohearandsee.end());
    for (int i = 0; i < nohearandsee.size(); i++)
        cout << nohearandsee[i] << endl;
}
