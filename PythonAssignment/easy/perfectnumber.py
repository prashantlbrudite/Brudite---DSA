number = int(input("Enter the number that you want to check : "))
sum = 0
for it in range(1,number):
    if(number % it == 0):
        sum += it


if(sum == number):
    print(f"{number} is a perfect number")
else:
    print(f"{number} is not a perfect number")