num = 12345

ans = 0

while num:
    digit = num % 10
    ans = 10*ans + digit
    num = num // 10


print(ans)