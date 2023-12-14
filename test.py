emp = [
    [1,"Prasahnt1", "Lalwani","Associate intern", 20000, "Engineer1","Rishabh Tiwari","4 Dec 2023",8384854361,"prashantlalwani1@gmail.com","Agra"],
    [2,"Prasahnt1", "Lalwani","SDE", 20000, "Engineer2","Rishabh Tiwari","4 Dec 2023",8384854362,"prashantlalwani2@gmail.com","Agra"],
    [3,"Prasahnt3", "Lalwani","intern", 20000, "Engineer3","Rishabh Tiwari","4 Dec 2023",8384854363,"prashantlalwani3@gmail.com","Agra"],
    [4,"Prasahnt4", "Lalwani","intern", 20000, "Engineer4","Rishabh Tiwari","4 Dec 2023",8384854364,"prashantlalwani4@gmail.com","Agra"],
    [5,"Prasahnt5", "Lalwani","intern", 20000, "Engineer5","Rishabh Tiwari","4 Dec 2023",8384854365,"prashantlalwani5@gmail.com","Agra"],
    [6,"Prasahnt6", "Lalwani","intern", 20000, "Engineer6","Rishabh Tiwari","4 Dec 2023",8384854366,"prashantlalwani6@gmail.com","Agra"],
    [7,"Prasahnt7", "Lalwani","intern", 20000, "Engineer7","Rishabh Tiwari","4 Dec 2023",8384854367,"prashantlalwani7@gmail.com","Agra"],
    [7,"Prasahnt8", "Lalwani","intern", 20000, "Engineer8","Rishabh Tiwari","4 Dec 2023",8384854368,"prashantlalwani8@gmail.com","Agra"],
    [8,"Prasahnt9", "Lalwani","intern", 20000, "Engineer9","Rishabh Tiwari","4 Dec 2023",8384854369,"prashantlalwani9@gmail.com","Agra"],
    [9,"Prasahnt10", "Lalwani","intern", 20000, "Engineer10","Rishabh Tiwari","4 Dec 2023",83848543610,"prashantlalwani10@gmail.com","Agra"],
    ]

ans = list(filter(lambda x : x[3] == "Associate intern", emp) )
print(ans)