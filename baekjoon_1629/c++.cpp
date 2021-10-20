#include<iostream>
using namespace  std;
long long fpow(long long a,long long b,long long c){
  if(b==1){
    return a%c;
  }
  else{
    long long x=fpow(a,b/2,c);
    if(x%2==0){
      return x%c*x%c*(a%c)%c;
    }
    else{
      return x%c*x%c;
    }
  }
}
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  long long a,b,c;
  cin>>a>>b>>c;
  cout<<fpow(a%c,b,c)<<'\n';
}