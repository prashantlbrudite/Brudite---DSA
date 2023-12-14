s = "he is a good boy "
ans = ""
i = 0
while(i < len(s)):
    if i == 0:
        ch = s[0].upper()
        ans += ch
        i += 1
        
    elif s[i-1] == " " and s[i] != " ":
        ch = s[i].upper()
        ans += ch
        i += 1
        
    elif(i+1 < len(s) and s[i+1] == " " and s[i] != " "):
        ch = s[i].upper() 
        ans += ch
        i += 1
        
    else :
        ans += s[i]
        i += 1

print(ans)      
