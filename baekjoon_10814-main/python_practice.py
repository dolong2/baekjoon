n= int(input())
member=[]
for i in range(n):
  age,name=map(str ,input().split())
  age=int(age)
  member.append((age,name))
member.sort(key= lambda member_list:(member_list[0]))
for member_list in member:
  print(member_list[0],member_list[1])
