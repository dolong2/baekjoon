#include<iostream>
#include<vector>
using namespace std;
int main(){
    cin.tie(0);
    cout.tie(0);
    int n,m;
    int arr[100000]={0};
    cin>>n>>m;
    for(int i=0;i<n;i++){
        cin>>arr[i+1];
        arr[i+1]+=arr[i];
    }
    for(int i=0;i<m;i++){
        int a,b;
        cin>>a>>b;
        cout<<arr[b]-arr[a-1]<<"\n";
    }
}