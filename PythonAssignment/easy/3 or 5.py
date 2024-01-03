a = int(input("Enter the number : "))
if(a%3 == 0 and a % 5 == 0):
    print("Brudite - Python Training")
elif(a % 3 == 0 ):
    print("Brudite")
elif(a % 5 == 0):
    print("Python Training")
else :
    print("this number is not divisible by 3 or 5!")