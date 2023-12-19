string = "wwwbba"

ans = ""

i = 0
 
count = 0
while(i < len(string)):
    j = i
    while j < len(string) and string[i] == string[j]:
        j+=1
        count += 1
    
    ans+= string[i]
    ans+= str(count)
    i = j
    count = 0

print(ans)
    