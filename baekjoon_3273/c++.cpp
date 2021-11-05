#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
  ios::sync_with_stdio(false);
  cout.tie(0);
  cin.tie(0);
    int n,x;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
      cin>>arr[i];
    sort(arr.begin(),arr.end());//오름 차순 정렬
    cin>>x;
    int left=0,right=n-1,cnt=0;
    while(1){//two pointer알고리즘 사용
      if(left>=right){
        break;
      }
      else if(x==arr[left]+arr[right]){
        left++;
        right--;
        cnt++;
      }
      else if(x>arr[left]+arr[right])
        left++;
      else if(x<arr[left]+arr[right])
        right--;
    }
    cout<<cnt<<'\n';
}