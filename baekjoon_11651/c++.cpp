#include<iostream>
#include <vector>
#include<algorithm>
using namespace std;
int main(){
  int n;
  vector<pair<int,int> >arr;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int x,y;
    scanf("%d %d",&x,&y);
    arr.push_back(pair<int,int>(y,x));
  }
  sort(arr.begin(),arr.end());
  for(int i=0;i<n;i++){
    printf("%d %d\n",arr[i].second,arr[i].first);
  }
}