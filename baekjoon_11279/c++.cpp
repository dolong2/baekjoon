#include<iostream>
#include<queue>
#include<vector>
using namespace std;
int main(){
  priority_queue<int> q;
  int n;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int a;
    scanf("%d",&a);
    if(a!=0){
      q.push(a);
    }
    else{
      if(!q.empty()){
        printf("%d\n",q.top());
        q.pop();
      }
      else
        printf("0\n");
    }
  }
}