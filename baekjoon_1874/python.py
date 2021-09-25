a=int(input())
cnt=1
save=[]
stack=[]
checked=False
for i in range(a):
  check=True
  num=int(input())
  while cnt<=num:
    save.append('+')
    stack.append(cnt)
    cnt+=1
    check=False
  while len(stack)!=0 and stack[len(stack)-1]>=num:
    save.append('-')
    stack.pop()
    check=False
  if check==True:
    checked=True
if checked==True:
  print("NO")
else:
  print('\n'.join(save))