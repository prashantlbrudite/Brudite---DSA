def login( mainUsername, mainPassword):
    
    
    n = 3
    while(n):
        if(n < 3):
            print(f" Invalid Credentials, You have {n} chances left!!")
        username = input("Enter the Username : ")
        password = input("Enter the Password : ")
        if username == mainUsername and password == mainPassword:
            break
        else:
            n -= 1
        
    if (n == 0):
        print("Authentication failed")
    else:
        print("Login Successfull")
        
login("Prashant", "12345")


    