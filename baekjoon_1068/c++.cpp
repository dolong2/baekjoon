#include<iostream>
#include<vector>

using namespace std;

vector<vector<int>> graph;
int erase,cnt=0;

void dfs(vector<vector<int>> graph,int root){
  if(root==erase){return;}
  if(graph[root].size()==0){cnt++;return;}
  else if(graph[root].size()==1){
    if(graph[root][0]==erase){
      cnt++;
      return;
    }
  }
  for(int i=0;i<graph[root].size();i++){
    dfs(graph,graph[root][i]);
  }
}

int main(){
  int num,root;
  cin>>num;
  graph.resize(num);
  for(int i=0;i<num;i++){
    int parent;
    cin>>parent;
    if(parent!=-1)
      graph[parent].push_back(i);
    else 
      root=i;
  }
  cin>>erase;
  dfs(graph,root);
  cout<<cnt<<endl;
}
