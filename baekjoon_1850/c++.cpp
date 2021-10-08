#include<iostream>
using namespace std;
long long gcd(long long a,long long b){
  return b?gcd(b,a%b):a;//유클리드 호제법
}
int main(){
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  long long a,b;
  cin>>a>>b;
  for(int i=0;i<gcd(a,b);i++)
    cout<<1;
  cout<<endl;
}