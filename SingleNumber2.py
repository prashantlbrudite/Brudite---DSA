list1 = [1,1,1,2,2,2,3,3,3,4,5,5,5,6,6,6]
st = set(list1)
a = sum(st)
b = sum(list1)
ans = (3*a - b)//2
print(ans)