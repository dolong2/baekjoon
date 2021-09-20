import heapq
import sys
n=int(input())
q=[]
for i in range(n):
  a=int(sys.stdin.readline().rstrip())
  if a!=0:
    heapq.heappush(q,(abs(a),a))
  else:
    if len(q)==0:
      print(0)
    else:
      print(heapq.heappop(q)[1])