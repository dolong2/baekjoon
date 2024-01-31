#include<iostream>
#include<map>

using namespace std;

int main() {
  cin.tie(0);
  cout.tie(0);
  
  int n,m;
  cin >> n;

  map<string, bool> map;
  for(int i = 0; i < n; i++) {
    string p1, p2;
    cin >> p1 >> p2;
    
    if (p1 == "ChongChong") map[p1] = true;
    if (p2 == "ChongChong") map[p2] = true;
    if (map.find(p1) == map.end()) map[p1] = false;
    if (map.find(p2) == map.end()) map[p2] = false;

    if (map[p1] && !map[p2]) map[p2] = map[p1];
    if (map[p2] && !map[p1]) map[p1] = map[p2];
  }

  int result = 0;
  for(auto iter: map)
    if(iter.second)
      result++;

  cout << result;
}