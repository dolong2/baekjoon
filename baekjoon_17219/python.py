n,m=map(int,input().split())
arr={}
for i in range(n):
  key,value=input().split()
  arr[key]=value
for i in range(m):
  key=input()
  print(arr[key])