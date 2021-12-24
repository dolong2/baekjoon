#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n,m;
    int arr[1000001];
    cin>>n>>m;
    long long low=1,high=-1;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]>high){
            high=arr[i];
        }
    }
    long long answer=0;
    while(low<=high){
        long long mid=(low+high)/2;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=arr[i]/mid;
        }
        if(cnt>=m){
            low=mid+1;
            if(answer<low)
                answer=mid;
        }
        else{
            high=mid-1;
        }
    }
    cout<<answer<<"\n";
}