num = 9876


while(num// 10):
    temp= num
    sum = 0
    while(temp):
        digit = temp%10
        sum += digit
        temp = temp // 10
    num = sum
        
print(num)
