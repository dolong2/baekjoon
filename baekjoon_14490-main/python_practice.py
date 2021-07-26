a,b=map(int,input().split(":"))
def gcd(a,b):
  if a<b:
    temp=a
    a=b
    b=temp
  while True:
    if b==0:
      break
    temp=a%b
    a=b
    b=temp
  return a
c=gcd(a,b)
a=int(a/c)
b=int(b/c)
c=str(a)+":"+str(b)
print(c)