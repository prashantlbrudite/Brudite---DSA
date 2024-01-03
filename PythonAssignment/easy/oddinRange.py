start = int(input("Enter the start : "))
end = int (input("Enter the end : "))
sum = 0
for it in range(start,end+1):
    if it%2 :
        sum += it
        
print(f"The sum of odd numbers between {start} and {end} is : {sum}")