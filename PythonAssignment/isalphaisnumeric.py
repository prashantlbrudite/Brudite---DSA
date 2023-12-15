s = input("Enter the string : ")

alphabets = 0

numbers = 0

for it in s:
    if(it.isalpha()):
        alphabets += 1
    elif(it.isnumeric()):
        numbers += 1
        
print(f"Alph -> {alphabets} and number -> {numbers}")