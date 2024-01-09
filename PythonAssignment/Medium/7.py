list1 = [1,2,3,4,5,6,7,8]


size = len(list1)

if(size%2 == 0):
    num1 = list1[size//2]
    num2 = list1[(size//2) - 1]
    
    print((num1 + num2)/2)

else:
    print(list1[size//2])