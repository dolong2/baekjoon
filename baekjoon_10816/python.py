def binary(arr,target,start,end):
  if start>end:
    return 0
  mid=(start+end)//2
  if target==arr[mid]:
    return arr[start:end+1].count(target)
  elif arr[mid]<target:
    return binary(arr,target,mid+1,end)
  else:
    return binary(arr,target,start,mid-1)

n=int(input())
arr = sorted(list(map(int, input().split())))
m=int(input())
target=list(map(int,input().split()))
dic={}
for i in arr:
  if i not in dic:
    dic[i]=binary(arr,i,0,len(arr)-1)
print(' '.join(str(dic[x]) if x in dic else '0' for x in target ))