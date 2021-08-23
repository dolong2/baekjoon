#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>
using namespace std;
vector<bool> visited;
void dfs(vector<vector <int>>graph,int start){
  visited[start]=true;
  printf("%d ",start);
  for(int i=0;i<graph[start].size();i++){
    if(!visited[graph[start][i]]){
      dfs(graph,graph[start][i]);
    }
  }
}
void bfs(vector<vector<int>> graph,int start){
  queue<int> temp;
  temp.push(start);
  visited[start]=true;
  while(!temp.empty()){
    int x=temp.front();
    temp.pop();
    printf("%d ",x);
    for(int node:graph[x]){
      if(!visited[node]){
        temp.push(node);
        visited[node]=true;
      }
    }
  }
}
int main(){
  int node,input,start;
  scanf("%d %d %d",&node,&input,&start);
  vector<vector<int>> graph(1001);
  for(int i=0;i<=node;i++){visited.push_back(false);}
  for(int i=0;i<input;i++){
    int a,b;//a에서 b로 향하는 이음선
    scanf("%d %d",&a,&b);
    graph[a].push_back(b);
    graph[b].push_back(a);
  }
  for(int i=0;i<graph.size();i++)
    sort(graph[i].begin(),graph[i].end());//접근할수있는 노드가 많을때는 숫자가 적은 노드부터 접근하는 조건때문에 오름차순 정렬
  dfs(graph,start);
  printf("\n");
  for(int i=0;i<=node;i++){visited[i]=false;}
  bfs(graph,start);
}