#include<iostream>
using namespace std;
int main(){
  int n,k,idx=0;
  char data[26];
  bool check=true;
  cin>>n>>k;
  for(int i=0;i<n;i++)data[i]='?';
  for(int i=0;i<k;i++){
    int num;
    char alphabet;
    cin>>num>>alphabet;
    idx=(idx+num)%n;
    if(data[idx]!='?'){
      if(data[idx]==alphabet)
        continue;
      check=false;
    }
    else
      data[idx]=alphabet;
  }

  for(int i=0;i<n;i++){
    if(data[i]=='?')
      continue;
    for(int j=i+1;j<n;j++){
      if (data[i] == data[j]){
          check = false;
          break;
      }
    }
  }
  if(check){
    for(int i=0;i<n;i++){
      cout<<data[idx];
      idx=(idx-1)%n;
      if(idx<0)
        idx+=n;
    }
  }
  else
    cout<<"!";
}
