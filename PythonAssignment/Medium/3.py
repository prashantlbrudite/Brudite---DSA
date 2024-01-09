list1 = [1,2,3,4,5]
target = 6
count = 0
for i in range(len(list1)):
    for j in range(len(list1)):
        if list1[i] + list1[j] == target and i != j:
            count += 1
            
print(count // 2)