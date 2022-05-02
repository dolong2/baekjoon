#include<iostream>
#include<vector>
#include <algorithm>

using namespace std;
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);
  vector<int>arr;
  int n,sum=0,prev=0;
  cin>>n;
  for(int i=0;i<n;i++){
    int a;
    cin>>a;
    arr.push_back(a);
  }
  sort(arr.begin(), arr.end());
  for(int i:arr){
    sum+=prev+i;
    prev+=i;
  }
  cout<<sum<<"\n";
}