s1 = input("Enter the value of first string: ")
s2 = input("Enter the value of second string: ")
list1 = [0]*26
for it in s1:
    list1[ord(it) - ord('a')] += 1
    
for it in s2:
    list1[ord(it) - ord('a')] -= 1

total = sum(list1)
if(total == 0):
    print(True)
else :
    print(False)