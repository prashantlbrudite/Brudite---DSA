temperature_readings = [25, 28, 21, 24, 27]
maxi = -1
mini = 9999999999
tot = sum(temperature_readings)

for it in temperature_readings :
    if(maxi < it):
        maxi = it
    if(mini > it):
        mini = it
        
    else:
        
        continue
print(f"Average_Temperature : {tot / len(temperature_readings)}")
print(f"Maximum_Temperature : {maxi}")
print(f"Minimum_Temperature : {mini}")
