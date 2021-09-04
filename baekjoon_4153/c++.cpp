#include<iostream>
using namespace std;
int main(){
  int x,y,z;
  while(1){
    cin>>x>>y>>z;
    if(x==0&&y==0&&z==0){break;}
    else if(x>y&&x>z){
      if(x*x==(y*y)+(z*z)){
        cout<<"right"<<endl;
      }else{
        cout<<"wrong"<<endl;
      }
    }
    else if(y>x&&y>z){
      if(y*y==(x*x)+(z*z)){
        cout<<"right"<<endl;
      } else{
        cout<<"wrong"<<endl;
      }
    }
    else if(z>x&&z>y){
      if(z*z==(x*x)+(y*y)){
        cout<<"right"<<endl;
      }else{
        cout<<"wrong"<<endl;
      }
    }
  }
}