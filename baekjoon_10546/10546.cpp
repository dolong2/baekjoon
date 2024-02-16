#include<iostream>
#include<map>

using namespace std;

int main() {
  cin.tie(0);
  cout.tie(0);

  int n;
  map<string, int> map;
  cin >> n;
  for(int i = 0; i < n; i++) {
    string input;
    cin >> input;
    map[input] += 1;
  }

  for(int j = 0; j < n-1; j++) {
    string finisher;
    cin >> finisher;
    map[finisher]--;
  }

  for(auto i : map) {
    if(i.second != 0) {
      cout << i.first << '\n';
    }
  }
}