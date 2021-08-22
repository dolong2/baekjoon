#include<iostream>
using namespace std;
int lcm(int a,int b){
  int temp;
  if(a>b){
    temp=a;
    a=b;
    b=temp;
  }
  while(b!=0){
    int temp=a%b;
    a=b;
    b=temp;
  }
  return a;
}
int main(){
  int n;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int a,b,l;
    scanf("%d %d",&a,&b);
    l=lcm(a,b);
    int x=a/l,y=b/l;
    printf("%d\n",x*y*l);
  }
}