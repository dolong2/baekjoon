import heapq
heap =[]
n=int(input())
b=[0]*(n**2)
for i in range(n):
  b=list(map(int,input().split()))
  for j in range(n):
    heapq.heappush(heap,b[j])
    if n<len(heap):
      heapq.heappop(heap)
print(heapq.heappop(heap))
