#include<iostream>

using namespace std;

int main(){
  int n,f;
  cin>>n;
  f = n/5;
  while(f>=0){
    int t = n-f*5;
    if(t%3 == 0){
      cout<<f+t/3<<endl;
      return 0;
    }else{
      f--;
    }
  }
  cout<<-1<<endl;
}