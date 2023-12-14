from functools import reduce

setMain = {'a', 'e', 'i', 'o', 'u'}
list1 = ["prashant", "education", "deduce", "aeiou"]

# list2 = list(reduce(lambda x, y: x and set(y).issubset(setMain), list1, True))
for it in list1:
    z = setMain.issubset(set(it))
    if z:
        print(it)

