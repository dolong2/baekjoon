package main

import (
	"fmt"
  "sort"
)
func search(target string,length int) bool{
  start:=0
  end:=length-1
  var mid int;
  for i:=0;start<=end;i++{
    mid=(start+end)/2;
    if(no_hear[mid]==target){
      return true
    }else if(no_hear[mid]<target){
      start=mid+1
    }else {end=mid-1}
  }
  return false;
}
var no_hear= []string{}
func main() {
  var m int
  var n int
  fmt.Scan(&n,&m)
  var no_see string
  var no_hear_and_see=[]string{}
  for i:=0;i<n;i++{
    fmt.Scan(&no_hear[i])
  }

  //정렬
  sort.Strings(no_hear)
  length:=0
  for i:=0;i<m;i++{
    fmt.Scan(&no_see)
    if(search(no_see,n)){
      no_hear_and_see[i]=no_see
      length+=1
    }
  }
  sort.Strings(no_hear_and_see)
  for i:=1;i<=length;i++{
    fmt.Println(no_hear_and_see[i])
  }
}
