import math
a,b=map(int,input().split())#a중 b개를 뽑은 조합의 수
c=math.factorial(a-b)
a=math.factorial(a)
b=math.factorial(b)
print(a//(b*c))