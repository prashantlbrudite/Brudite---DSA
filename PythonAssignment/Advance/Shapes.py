class Shape:
    def shape(self):
        print("I am a valid shape")

class Square(Shape):
    def __init__(self,side = 0):
        print(f"My area is {side*side}")

circle = Shape()
circle.shape()

sqr1 = Square(12)