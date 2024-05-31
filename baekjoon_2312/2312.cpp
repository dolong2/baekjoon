#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int main() {
    int N;
    cin >> N;
    
    const int MAX = 100000;
    vector<int> sieve(MAX + 1, 0);

    for (int x = 2; x <= MAX; x++) {
        if (sieve[x] == 1) continue;
        for (int u = 2 * x; u <= MAX; u += x) {
            sieve[u] = 1;
        }
    }

    for (int i = 0; i < N; i++) {
        int n;
        cin >> n;
        map<int, int> m;
        
        for (int i = 2; n > 1; i++) {
            if (sieve[i] == 0) {
                while (n % i == 0) {
                    m[i]++;
                    n /= i;
                }
            }
        }
        
        vector<int> sortKeys;
        for (const auto& kv : m) {
            sortKeys.push_back(kv.first);
        }
        sort(sortKeys.begin(), sortKeys.end());

        for (int k : sortKeys) {
            cout << k << " " << m[k] << endl;
        }
    }

    return 0;
}
