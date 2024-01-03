encoded_str = "Prashant0Lalwani0123"

list1 = encoded_str.split('0');

dic = {}

dic['Name'] = list1[0]
dic['Surname'] = list1[1]
dic['id'] = list1[2]

print(dic)