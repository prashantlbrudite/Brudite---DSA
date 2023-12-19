file = open("demo.txt", "r")

content = file.readlines()

file.close()

lines = len(content)

print(f"The number of lines in demo.txt are {lines}")
