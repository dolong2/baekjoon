#include<iostream>
#include<map>
#include <vector>
#include <sstream>

using namespace std;

int main() {
  cin.tie(0);
  cout.tie(0);

  int n;
  map<string, int> map;
  
  cin >> n;
  for(int i = 0; i < n; i++) {
    string fileName;
    cin >> fileName;
    vector<string> tokens;
    istringstream iss(fileName);
    string token;
    while (getline(iss, token, '.')) {
        tokens.push_back(token);
    }
    map[tokens[1]]++;
  }
  
  for(auto iter = map.begin(); iter != map.end(); iter++){
    cout << iter->first << " " << iter->second << endl;
  }
}