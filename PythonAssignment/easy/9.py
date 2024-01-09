list1 = [1,1,1,2,2,2,3,3,3,4,4,4,5,5,5]

dictionary = {}

for it in list1:
    if it in dictionary.keys():
        num = dictionary[it]
        dictionary[it] = num+1
    else:
        dictionary[it] = 1
print(dictionary)