#include<iostream>
#include<vector>
using namespace std;
bool visited[100000+1]={false};
int parents[100000+1]={0};
vector<int> tree[100000+1];
void dfs(vector<int> tree[],int root){
  visited[root]=true;
  for(int i=0;i<tree[root].size();i++){
    if(!visited[tree[root][i]]){
      parents[tree[root][i]]=root;
      dfs(tree,tree[root][i]);
    }
  }
  return;
}
int main(){
  int n;
  scanf("%d",&n);
  for(int i=0;i<n-1;i++){
    int x,y;
    scanf("%d %d",&x,&y);
    tree[x].push_back(y);
    tree[y].push_back(x);
  }
  dfs(tree,1);
  for(int i=2;i<=n;i++){
    printf("%d\n",parents[i]);
  }
}