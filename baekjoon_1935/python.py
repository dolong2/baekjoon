n=int(input())
st=input()
dic={}
stack=[]
for i in range(n):
  dic[chr(i+65)]=int(input())
for i in st:
  if i!='+' and i!='-' and i!='*'and i!='/':
    stack.append(dic[i])
  else:
    op2=stack.pop()
    op1=stack.pop()
    if(i=="+"):
      stack.append(op1+op2)
    elif(i=="*"):
      stack.append(op1*op2)
    elif(i=="-"):
      stack.append(op1-op2)
    else:
      stack.append(op1/op2)
print("%.2f"%stack.pop())