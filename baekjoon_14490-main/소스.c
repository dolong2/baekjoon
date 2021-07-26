#include<stdio.h>
int gcd(int n,int m){
  int temp;
  if(n<m){
    temp=m;
    m=n;
    n=temp;
  }
  while(m!=0){
    temp=n%m;
    n=m;
    m=temp;
  }
  return n;
}
int main(){
  int n,m;
  scanf("%d:%d",&n,&m);
  int Gcd=gcd(n,m);
  printf("%d:%d",n/Gcd,m/Gcd);
}
