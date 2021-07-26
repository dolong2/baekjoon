a=int(input())
'''
"재귀함수가 뭔가요?"
"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
'''
print("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.",sep='\n')
s1='\"재귀함수가 뭔가요?\"'
s2="\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
s3="마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
s4="그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
print(s1,sep='\n')
print(s2,sep='\n')
print(s3,sep='\n')
print(s4,sep='\n')
def underbar(n):
  for i in range(n*4):
    print("_",end='')
def professor(n,s1,s2,s3,s4,cnt):
  underbar(cnt)
  print(s1)
  if n==1:
    underbar(cnt)
    print("\"재귀함수는 자기 자신을 호출하는 함수라네\"")
    underbar(cnt)
    print("라고 답변하였지.")
  else:
    underbar(cnt)
    print(s2,sep='\n')
    underbar(cnt)
    print(s3,sep='\n')
    underbar(cnt)
    print(s4,sep='\n')
    professor(n-1,s1,s2,s3,s4,cnt+1)
    underbar(cnt)
    print("라고 답변하였지.",sep='\n')
professor(a,s1,s2,s3,s4,1)
print("라고 답변하였지.")