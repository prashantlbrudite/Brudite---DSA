list1 = [1,2,3,4,5]

D = 8

rotateValue = D % len(list1)

ansList = list1[len(list1) - rotateValue : ] + list1[: len(list1) - rotateValue]

print(ansList)