#include<iostream>
using namespace std;
int gcd_(int n, int m) {
    int temp;
    if (n < m)temp = m, m = n, n = temp;
    while (m != 0) {
        temp = n % m;
        n = m;
        m = temp;
    }
    return n;
}
int main() {
    int n, m, gcd;
    scanf("%d:%d", &n, &m);
    gcd = gcd_(n, m);
    cout << n / gcd << ":" << m / gcd << endl;
}
