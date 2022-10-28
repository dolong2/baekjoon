#include <iostream>

using namespace std;

double fac(double n){
  if(n==0)
    return 1;
  if(n==1)
    return 1;
  return n*fac(n-1);
}

int main(){
  int n;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%.lf\n",fac(b)/(fac(b-a)*fac(a)));
  }
}