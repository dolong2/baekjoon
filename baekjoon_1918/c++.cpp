#include<iostream>
#include<stack>
using namespace std;
int priority(char a){
  if(a=='('||a==')'){return 0;}
  else if(a=='+'||a=='-'){return 1;}
  else if(a=='*'||a=='/'){return 2;}
  return 0;
}
int main(){
  string a;
  cin>>a;
  stack<char> s;
  for(auto i:a){
    if(i=='+'||i=='-'||i=='*'||i=='/'){
      while(!s.empty()&&priority(i)<=priority(s.top())){
        printf("%c",s.top());
        s.pop();
      }
      s.push(i);
    }
    else if(i=='('){
        s.push(i);
    }
    else if(i==')'){
      char top_op=s.top();
      s.pop();
      while(top_op!='('){
        printf("%c",top_op);
        top_op=s.top();
        s.pop();
      }
    }
    else{
        printf("%c",i);
    }
  }
  while(!s.empty()){
    printf("%c",s.top());
    s.pop();
  }
}