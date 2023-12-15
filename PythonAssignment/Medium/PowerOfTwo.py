def checkPowerOfTwo(num):
    if(num == 0):
        return True
        
    return num&1 and checkPowerOfTwo(num>>1)
    
num = 6

ans = checkPowerOfTwo(num - 1)
if(ans) :
    print(True)
else:
    print(False)