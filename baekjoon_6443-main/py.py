def anagram(a,start,end):
  if start==end-1:
    print("".join(a))
    return;

  for i in range(start,end):
    if i!=start and a[i]==a[start]:
      continue
    if a[i]!=a[start]:
      a=a.copy()
      temp=a[i]
      a[i]=a[start]
      a[start]=temp
    anagram(a,start+1,end)
    
n=int(input())
for i in range(n):
  a=sorted(input())
  anagram(a,0,len(a))