#include<iostream>
#include<set>
#include<vector>
#include<algorithm>

using namespace std;

void input_set(set<int> &s, int repeat) {
  for(int i = 0; i < repeat; i++) {
    int input;
    cin >> input;
    s.insert(input);
  }
}

int main() {
  cin.tie(0);
  cout.tie(0);
  
  int n,m;
  cin >> n >> m;

  set<int> a, b;
  input_set(a, n);
  input_set(b, m);

  vector<int> res;
  set_intersection(a.begin(), a.end(), b.begin(), b.end(), back_inserter(res));
  
  cout << n + m - (2 * res.size()) << endl;
}
