#include<iostream>
#include<vector>
using namespace  std;
int cnt=0;
typedef struct node * treepointer;
typedef struct node{
  int data;
  treepointer left,right,parent;
}node;//트리의 데이터,왼쪽 노드,오른쪽 노드,부모 노드가 들어있는 노드 구조체

void preorder(treepointer ptr){
  if(ptr){
    if(ptr->left==NULL&&ptr->right==NULL){
      cnt++;
    }
    preorder(ptr->left);
    preorder(ptr->right);
  }
}//순회 하면서 왼쪽과 오른쪽이 NULL이면 cnt++

int main(){
  int num;
  scanf("%d",&num);
  node nodes[num+1];
  for(int i=0;i<num;i++){
    nodes[i].data=0;
    nodes[i].left=NULL;
    nodes[i].right=NULL;
  }

  for(int i=0;i<num;i++){
    int parent;
    scanf("%d",&parent);
    if(nodes[parent].left==NULL){
      nodes[i].data=i;
      nodes[parent].left=&nodes[i];
      nodes[i].parent=&nodes[parent];
    }
    else{
      nodes[parent].right=&nodes[i];
      nodes[i].parent=&nodes[parent];
    }
  }

  int erase;
  scanf("%d",&erase);
  if(erase==0){
    printf("%d",cnt);
    return 0;
  }
  nodes[erase].parent->left->data==nodes[erase].data?nodes[erase].parent->left=NULL:nodes[erase].parent->right=NULL;//부모 노드와의 연결을 끊어서 삭제

  preorder(&nodes[0]);
  printf("%d",cnt);
}