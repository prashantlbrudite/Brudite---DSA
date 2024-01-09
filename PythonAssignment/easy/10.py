string = "He is a good boy"


list1 = string.split(" ")
# list1.sort(reverse = True)
list1 = list1[: : -1]

# ans = list1.join(" ")
ans = ""
for it in list1 :
    ans += it 
    ans += " "



print(ans)