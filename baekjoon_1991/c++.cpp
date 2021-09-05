#include<iostream>
#include<vector>
using namespace std;
typedef struct  node{
  char root;
  node *right,*left;
}node;
void preorder(node *node){
  if(node){
    printf("%c",node->root);
    preorder(node->left);
    preorder(node->right);
  }
}
void inorder(node *node){
  if(node){
    inorder(node->left);
    printf("%c",node->root);
    inorder(node->right);
  }
}
void postorder(node *node){
  if(node){
    postorder(node->left);
    postorder(node->right);
    printf("%c",node->root);
  }
}
int main(){
  int n;
  scanf("%d",&n);
  node nodes[n];
  for(int i=0;i<n;i++){
    char root,right,left;
    cin>>root>>left>>right;
    nodes[root-65].root=root;
    right!='.'?nodes[root-65].right=&nodes[right-65]:nodes[root-65].right=NULL;
    left!='.'?nodes[root-65].left=&nodes[left-65]:nodes[root-65].left=NULL;
  }
  preorder(&nodes[0]);
  printf("\n");
  inorder(&nodes[0]);
  printf("\n");
  postorder(&nodes[0]);
  printf("\n");
}