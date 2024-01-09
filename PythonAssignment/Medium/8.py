s = "Hello World!"

s = s.lower()

vowels = "aeiou"

count = 0

for it in s:
    if it in vowels:
        count+=1
        
print(count)