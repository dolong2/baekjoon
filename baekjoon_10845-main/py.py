import sys
que=[]
answer=[]
a=int(sys.stdin.readline().rstrip())
for i in range(a):
  order=sys.stdin.readline().rstrip()
  order=order.split(' ')
  if order[0]=="push":
    que.append(int(order[1]))
  elif order[0]=="pop":
    if len(que)!=0:
      answer.append(que[0])
      del que[0]
    else :
      answer.append(-1)
  elif order[0]=="size":
    answer.append(len(que))
  elif order[0]=="empty":
    answer.append("1"if len(que)==0 else "0")
  elif order[0]=="front":
    answer.append(que[0] if len(que)!=0 else "-1")
  else :
    answer.append(que[len(que)-1] if len(que)!=0 else "-1")
for i in answer:
  print(i)