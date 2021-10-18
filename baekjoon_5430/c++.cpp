#include<iostream>
#include<algorithm>
#include<deque>
#include<string>
using namespace std;
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  int n;
  cin>>n;
  for(int i=0;i<n;i++){
    bool reverse=false,error=false;
    deque<int> deq;
    string order,lowData;
    cin>>order;//명령 입력
    int len;
    cin>>len;//배열 길이 입력
    cin>>lowData;//숫자 입력
    string s = "";//두자리수 이상 대비
    for (int i = 0; i<lowData.length();i++) { 
      if (isdigit(lowData[i])) { 
        s += lowData[i]; 
      } 
      else {
        if (!s.empty()) {
          deq.push_back(stoi(s));
          s = ""; 
        } 
      } 
    }
    for(auto i:order){
      if(i =='R'){
        reverse=!reverse;
      }
      else{
        if(deq.empty()){
            cout<<"error\n";
            error=true;
            break;
        }
        if(reverse){
          deq.pop_back();
        }
        else{
          deq.pop_front();
        }
      }
    }
    if(!error){
      cout<<"[";
    }
    if(reverse){
      while(!deq.empty()){
        if(deq.size()==1){
          cout<<deq.back();
        }
        else
          cout<<deq.back()<<",";
        deq.pop_back();
      }
    }
    else if (!reverse){
      while(!deq.empty()){
        if(deq.size()==1){
          cout<<deq.front();
        }
        else
          cout<<deq.front()<<",";
        deq.pop_front();
      }
    }
    if(!error){
      cout<<"]\n";
    }
  }
}