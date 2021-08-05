#include<iostream>
#include<algorithm>
using namespace std;
int main(){
  int n,arr[500000],m,brr;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  sort(arr,arr+n);
  scanf("%d",&m);
  for(int i=0;i<m;i++){
    scanf("%d",&brr);
    cout<<upper_bound(arr, arr+n, brr)-lower_bound(arr, arr+n, brr)<<" ";
  }
}