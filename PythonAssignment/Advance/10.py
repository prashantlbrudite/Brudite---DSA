string = "GACCBDDBAGEE"

st = set()

n = 3
count = 0
for it in string:
    print(st)
    if it in st:
        st.remove(it)
        continue
    elif len(st) < n:
        st.add(it)
        continue
    
    elif(len(st) == n):
        count+= 1
    
        
print((count + 1)//2)