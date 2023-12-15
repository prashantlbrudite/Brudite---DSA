list1= [1,2,3,4,5]
list2 = [4,5,6,7,8]

st1 = set(list1)
st2 = set(list2)

ans = st1.intersection(st2)

ansList = list(ans)
print(ansList)