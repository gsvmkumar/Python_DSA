class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, P):
        return Point(self.x + P.x, self.y + P.y)
    def __sub__(self, P):
        return Point(self.x - P.x, self.y - P.y)
    def __mul__(self, P):
        return Point(self.x * P.x, self.y * P.y)
    
    def __str__(self):
        return f"Point({self.x}, {self.y})"
    
a1,b1=map(int, input("Enter the coordinates of the first point (x y): ").split())
a2,b2=map(int, input("Enter the coordinates of the second point (x y): ").split())
point1 = Point(a1, b1)
point2 = Point(a2, b2)

print("First Point:", point1)
print("Second Point:", point2)
print("Addition of the two points:", point1 + point2)
print("Subtraction of the two points:", point1 - point2)
print("Multiplication of the two points:", point1 * point2)