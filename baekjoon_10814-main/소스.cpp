#include<iostream>
#include<map>

using namespace std;

int main(){
  multimap<int,string> m;
  int n;
  char b[101];
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    int arr;
    string a;
    scanf("%d %s",&arr,b);
    a=b;
    m.insert(pair<int ,string>(arr,a));
  }
  for(auto iter = m.begin(); iter != m.end(); iter++)
        printf("%d %s\n",iter->first,iter->second.c_str());
}
