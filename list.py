list1 = [1,2,3,4,5,6,7,7,8,8,1]
val = list1.count(3)
print(val)

list1.append(9)

num = list1.pop()

list1.append(num)

list1.insert(0,0)

list2 = list1

print(list2)
    
print(list1.index(1))

print(list1.count(8))

list1.sort()

list1.reverse()

list3 = list1.copy()
print(list3)

print(list1)

list2.clear() # also cleared the list1