#include<iostream>
#include<vector>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    vector<int> arr;
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    int min=1000000000;
    int answer=1111111111;
    for(auto i:arr){
        int sum=0;
        for(auto j:arr){
            sum+=j-i>0?j-i:-1*(j-i);
        }
        if(sum<min){
            min=sum;
            answer=i;
        }
        else if(sum==min){
            if(answer>i){
                answer=i;
            }
        }
    }
    cout<<answer<<'\n';
}