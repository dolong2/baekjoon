#include<iostream>
#include<map>
using namespace std;
int main(){
  cin.tie(NULL);
  ios::sync_with_stdio(false);
  int n,m;
  map<string,string> site;
  cin>>n>>m;
  for(int i=0;i<n;i++){
    string key,value;
    cin>>key>>value;
    site[key]=value;
  }
  for(int i=0;i<m;i++){
    string target;
    cin>>target;
    cout<<site[target]<<"\n";
  }
}