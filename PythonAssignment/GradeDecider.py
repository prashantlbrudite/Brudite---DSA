subjects = ["Physics", "Chemistry", "Biology", "Mathematics" , "Computer"]

numbers = []

for it in subjects:
    a = int(input(f"Enter the marks of {it} : "))
    numbers.append(a)
    
total = sum(numbers)
average = total / len(subjects)
# percentage = average * 100
print(average)
if(average > 100):
    print("You have entered wrong marks!!")
    print("please try again")
else :
    if(average >= 90):
        print("Grade A")
    elif(average >= 80):
        print("Grade B")
    elif(average >= 70):
        print("Grade C")
    elif(average >= 60):
        print("Grade D")
    elif(average >= 40):
        print("Grade E")
    else:
        print("Grade F")
        
