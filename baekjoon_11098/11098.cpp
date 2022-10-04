#include <vector>
#include <algorithm>
#include<iostream>
#include<map>

using namespace std;

bool cmp(int a, int b) { 
  return a > b; 
}

int main() {
  int n;
  cin>>n;
  for(int i=0;i<n;i++){
    int a;
    vector<int> arr;
    map<int,string> m;
    cin>>a;
    for(int j=0;j<a;j++){
      int num;
      string str;
      cin>>num>>str;
      arr.push_back(num);
      m.insert(pair<int, string>(num, str));
      sort(arr.begin(), arr.end(), cmp);
    }
    cout<<m.at(arr[0])<<endl;
  }
}