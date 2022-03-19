#include<iostream>
using namespace std;
int gcd(int num1, int num2){
  if(num2 == 0) return num1;
  else return gcd(num2, num1 % num2);
}
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);
  int n,m;
  int a,b;
  cin>>n>>m;
  cin>>a>>b;
  int l=m*b/gcd(m,b);
  int son=n*(l/m)+a*(l/b);
  int g=gcd(son,l);
  cout<<son/g<<" "<<l/g<<"\n";
}