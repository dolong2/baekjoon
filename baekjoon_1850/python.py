def gcd(m,n):
    while n != 0:
       t = m%n
       (m,n) = (n,t)
    return abs(m)
n,m=map(int,input().split())
for i in range(gcd(n,m)):
  print(1,end="")