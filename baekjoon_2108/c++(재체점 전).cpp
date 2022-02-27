#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
bool comp(const pair<int, int> &p1,const pair<int, int> &p2){
  if(p1.second == p2.second){
    return p1.first < p2.first;
  }
  return p1.second > p2.second;
}
int main(){
  int arr[500000]={0},n;
  double sum=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
    sum+=arr[i];
  }
  sort(arr,arr+n);
  printf("%.0lf\n",sum/n);
  printf("%d\n",arr[n/2]);
  vector<pair<int,int> > map; 
  for(int i=0; i<n; i++){
    if(map.empty()){
      map.push_back(pair<int,int>(arr[i],1));
      continue;
    }
    if(map.back().first == arr[i]){
      pair<int, int> tmp = map.back();    
      tmp.second++;
      map.pop_back();
      map.push_back(tmp);
    }else{ 
      map.push_back(pair<int,int>(arr[i],1));    
    }
  }
  sort(map.begin(), map.end(),comp); 
  if(map[0].second == map[1].second){
    cout << map[1].first << endl;
  }else{
    cout << map[0].first << endl;
  }
  printf("%d\n",arr[n-1]-arr[0]);
}