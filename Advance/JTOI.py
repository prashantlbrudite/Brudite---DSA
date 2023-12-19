def JTOI(filename):
    file = open(f"{filename}.txt", "r")

    content = file.read()

    file.close()

    str=""

    for it in content :
        if it == "J":
            # print("I", end="")
            str += "I"

        else: 
            # print(it)
            str+= it
    print(str)

JTOI("WORDS")