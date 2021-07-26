n,m=map(int,input().split(" "))
c=[input()for _ in range(n)]
c.sort()
z=list()
def search(target,to,n):
  end=int(n-1)
  start=int(0)
  while start<=end:
    mid=int((start+end)/2)
    if target[mid]==to: return True
    elif target[mid]>to: end=mid-1
    else: start=mid+1
  return False
for i in range(m):
  d=input()
  if search(c,d,n):z.append(d)
print(len(z),sep='\n')
z.sort()
for i in range(len(z)):
  print(z[i],sep='\n')