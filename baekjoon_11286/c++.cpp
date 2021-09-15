#include<iostream>
#include<queue>
#include<vector>
using namespace std;
int main(){
  priority_queue<pair<int, int>, vector<pair<int, int> >, greater<pair<int, int> > > q;
  int n;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int a;
    scanf("%d",&a);
    if(a!=0){
      q.push(make_pair(abs(a), a));
    }
    else{
      if(!q.empty()){
        cout<<q.top().second<<'\n';
        q.pop();
      }
      else
        printf("0\n");
    }
  }
}