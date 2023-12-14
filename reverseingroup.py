s ="abcdef"

groupSize = 2
ans = ""
i =0

# while i < len(s):
    # copy = s[i+4:i: -1]
    # ans += copy
    # i += 4
	
while i < len(s):
    for j in range(i+groupSize-1, i -1, -1):
        if j < len(s):
            ans += s[j]
    i += groupSize
    
print(ans)
