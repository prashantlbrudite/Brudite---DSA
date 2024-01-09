s = input("Enter the string : ")
c = input("Enter the character : ")

ans = list(map(lambda x : x[0] == c , s))

print(ans[0])
