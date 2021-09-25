#include<iostream>
#include<vector>
#include<stack>
using namespace std;
int main(){
  int n;
  int cnt=1;
  vector<int> save;
  stack<int> s;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int a;
    bool check=false;
    scanf("%d",&a);
    while(cnt<=a){
      save.push_back('+');
      s.push(cnt++);
      check=true;
    }
    while(!s.empty()&&s.top()>=a){
      save.push_back('-');
      s.pop();
      check=true;
    }
    if(!check){
      printf("NO");
      return 0;
    }
  }
  for(auto i:save){
    printf("%c\n",i);
  }
}