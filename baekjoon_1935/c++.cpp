#include<iostream>
#include<stack>
#include<map>
using namespace std;
int main(){
  int n;
  string str;
  map<char,int> map;
  stack<double> s;//operand
  scanf("%d",&n);
  cin>>str;
  for(char i:str){
    if(i=='*'||i=='/'||i=='+'||i=='-')
      continue;
    map.insert(pair<char,int>(i,0));
  }
  for(int i=0;i<n;i++){
    int num;
    scanf("%d",&num);
    map[i+65]=num;
  }
  for(char i:str){
    if(i!='*'&&i!='/'&&i!='+'&&i!='-'){
      s.push(map[i]);
    }
    else{
      double op2=s.top();
      s.pop();
      double op1=s.top();
      s.pop();
      if(i=='*'){
        s.push(op1*op2);
      }
      else if(i=='+'){
        s.push(op1+op2);
      }
      else if(i=='-'){
        s.push(op1-op2);
      }
      else if(i=='/'){
        s.push(op1/op2);
      }
    }
  }
  printf("%.2lf",s.top());
}