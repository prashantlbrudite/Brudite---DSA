
s = "aaabbbcccdddf"
i = 0;
count = 0;
ans = ""
while i < len(s) :
    
    ch = s[i]
    j = i
    while j < len(s) and s[i] == s[j]:
        count+= 1
        j+=1
    
    ans += ch
    ans += str(count)
    count = 0
    i = j
    
print(ans)