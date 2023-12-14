tuple1 = ()

print(len(tuple1)) # gives 0

tuple2 = '2', # way of declaring a tuple with a single value inside it

print(len(tuple2)) # gives 1

tuple3 = 132, 132, "hello" # another way of declaring a tuple

print(len(tuple3))

#interpolling of strings using the % operator
print("hello %s , You are %s years old" % ("Prashant", 20))

tup = tuple(x**2 for x in range(10))
print(tup)