#include<iostream>
#include<set>
using namespace std;
int main(){
  int n;
  scanf("%d",&n);
  multiset<int> s;
  for(int i=0;i<n;i++){
    int test;
    scanf("%d",&test);
    for(int j=0;j<test;j++){
      char order;
      int data;
      scanf(" %c %d",&order,&data);
      if(order=='I'){
        s.insert(data);
      }
      else{
        if(!s.empty()){
          if(data==1){
            auto last=s.end();
            last--;
            s.erase(last);
          }
          else{
            s.erase(s.begin());
          }
        }
        else{
          continue;
        }
      }
    }
    if(!s.empty()){
      auto last=s.end();
      last--;
      printf("%d %d\n",*last,*s.begin());
    }
    else
      printf("EMPTY\n");
    s.clear();
  }
}//시간이 매우 오래 걸림 but 통과는함
//나중에 시간나면 수정