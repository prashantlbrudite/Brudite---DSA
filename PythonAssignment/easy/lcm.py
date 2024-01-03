def getGCD(a,b):
    if(b == 0):
        return a
        
    return getGCD(b, a - b)
    
a = int(input("Enter the first number : "))
b = int(input("Enter the second number : "))
gcd = 0
if(a > b):
    gcd = getGCD(a,b)
else: 
    gcd = getGCD(b,a)
    
lcm = (a*b)//gcd
print(lcm)