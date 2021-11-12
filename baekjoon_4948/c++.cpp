#include<iostream>
#include<cmath>
#include<vector>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    while(true){
        int n,cnt=0;
        cin>>n;
        if(n==0)break;
        vector<bool>arr(2*n+1);
        arr[1]=true;
        for(int i=2;i<=sqrt(2*n);i++){
            if(arr[i])continue;
            for(int j=i+i;j<=2*n;j+=i)
                arr[j] = true;
        }
        for(int i=n+1;i<2*n+1;i++){
            if(!arr[i]){cnt++;}
        }
        cout<<cnt<<endl;
    }
}