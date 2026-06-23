class Person:
    def __init__(self, name, salary, dob):
        self.name = name
        self.salary = salary
        self.dob = dob
        self.op = "salary"

    def __gt__(self, other):
        if self.op =="salary":
            return self.salary > other.salary
        elif self.op == "dob":
            return self.dob > other.dob

    def __lt__(self, other):
        if self.op =="salary":
            return self.salary < other.salary
        elif self.op == "dob":
            return self.dob < other.dob

    def __eq__(self, other):
        return self.salary == other.salary

    # def older_by_dob(self, other):
        


p1 = Person("Hari", 2500, "2000-06-15")
p2 = Person("Raj", 3000, "1996-03-20")

# Menu-driven program
while True:
    print("\n--- MENU ---")
    print("1. Compare based on salary (using operator overloading)")
    print("2. Compare based on Date of Birth")
    print("3. Exit")

    choice = int(input("Enter your choice: "))

    if choice == 1:
        p1.op ,p2.op = "salary","salary"
        if p1 > p2:
            print(f"{p1.name} is gains more than {p2.name} ")
        elif p1 < p2:
            print(f"{p2.name} is gains more than {p1.name} ")
        else:
            print("Both have the same salary")

    elif choice == 2:
        p1.op ,p2.op = "dob","dob"
        if p1 < p2:
            print(f"{p1.name} is older (DOB: {p1.dob})")
        elif p1 > p2:
            print(f"{p2.name} is older (DOB: {p2.dob})")
        else:
            print("Both have the same DOB")
        # print(p1.older_by_dob(p2))

    elif choice == 3:
        print("Exiting program...")
        break

    else:
        print("Invalid choice! Try again.")