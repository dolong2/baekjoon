#include <iostream>
#include<stack>
#include<string>

using namespace std;
int main() {
  int a;

  string b;
  stack<int> s;
  cin >> a ;
  cin.ignore();

  for(int i=0;i<a;i++){
    getline(cin,b);
    for(int i=0;i<b.size();i++){
		  if (b[i]=='(') {
        s.push(3);
		  }
		  else if (b[i]==')') {
        if(s.empty()==1){
          cout << "NO"<<endl;
          goto ww;
        }
			  s.pop();
		  }
    }
    if(s.size()==0){
      cout << "YES"<<endl;
    }
    else {
      cout <<"NO"<<endl;
    }
    ww:
    while(!s.empty()){
      s.pop();
    }
    }
}