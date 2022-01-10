#include<iostream>
#include<algorithm>
#include<vector>
#include<map>
using namespace std;
bool cmp(const pair<int,int>& a, const pair<int,int>& b) {
	if (a.second == b.second) return a.first == b.first;
	return a.second > b.second;
}
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n,c;
    cin>>n>>c;
    map<int,int> m;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        if(m.find(a)!=m.end()){
            m[a]++;
        } 
        else{
            m.insert({a,1});
        }
    }
    vector<pair<int,int>> vec( m.begin(), m.end());
    sort(vec.begin(),vec.end(),cmp);
    for(auto itr:vec){
        for(int i=0;i<itr.second;i++){
            cout<<itr.first<<" ";
        }
    }
}