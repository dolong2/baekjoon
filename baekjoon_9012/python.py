n=int(input())
answer=[]
for i in range(n):
  arr=[]
  str=input()
  for i in list(str):
    
    if i=="(":
      arr.append(1)
    else:
      if(len(arr)==0):
        arr.append(-1)
        break
      arr.pop()
  if len(arr)==0:
    answer.append("YES")
  else:
    answer.append("NO")
print('\n'.join(answer))