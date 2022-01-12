#include<iostream>
#include<algorithm>
#include<vector>
#include<map>
using namespace std;
map<int,int> order;//몇번째로 해당 숫자가 입력됐는지 확인
bool cmp(const pair<int,int> &a, const pair<int,int> &b) {
	if(a.first==b.first) return order[a.second]<order[b.second];//만약 앞에있는 숫자가 뒤에 있는 숫자보다 더 먼저 들어왔으면 true
	return a.first > b.first;
}
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    map<int,int> m;
    int n,c;
    cin>>n>>c;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        if(m.find(a)!=m.end()){
            m[a]++;
        } 
        else{
            m.insert({a,1});
        }
        if(order[a]==0)order[a]=i+1;
    }
    vector<pair<int,int>> vec;
    for(auto itr:m){
        vec.push_back({itr.second,itr.first});
    }
    sort(vec.begin(),vec.end(),cmp);
    for(auto itr:vec){
        for(int i=0;i<itr.first;i++){
            cout<<itr.second<<" ";
        }
    }
}