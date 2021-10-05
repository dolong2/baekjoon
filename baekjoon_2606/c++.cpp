#include<iostream>
#include<vector>
using namespace std;
bool check[101]={false};
int cnt=0;
void dfs(int start,vector<int>graph[]){
  check[start]=true;
  cnt++;
  for(int i=0;i<graph[start].size();i++){
    int next= graph[start][i];
    if(check[next]==false){
      dfs(next,graph);
    }
  }
}
int main(){
  vector<int> graph[101];
  int n,m;
  cin>>n>>m;
  for(int i=0;i<m;i++){
    int parent,son;
    cin>>parent>>son;
    graph[parent].push_back(son);
    graph[son].push_back(parent);
  }
  dfs(1,graph);
  cout<<cnt-1<<endl;
}