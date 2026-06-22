class Node:
    def __init__(self,x):
        self.data=x
        self.next=None

class Menu_code:
    def __init__(self):
        self.head=None
    def insertBegin(self,x):
        t=Node(x)
        t.next=self.head
        self.head=t
        return self.head
    def insertEnd(self,x):
        t=Node(x)
        if self.head is None:
            self.head=t
            self.head.next=None
        else:
            self.curr=self.head
            while self.curr.next is not None:
                self.curr=self.curr.next
            t.next=None
            self.curr.next=t
        return self.head
    def insert_Pos(self, x, pos):
        if pos<1:
            return self.head
        t=Node(x)
        if pos==1:
            t.next=self.head.next
            self.head.next = t
            return self.head
        curr = self.head
        for i in range(1, pos ):
            if curr is None:
                return self.head
            curr = curr.next
        if curr is None:
            return self.head
        t.next = curr.next
        curr.next = t
        return self.head
    def deleteBegin(self):
        if self.head is None:
            return self.head
        self.head=self.head.next
        return self.head
    def deleteEnd(self):
        if self.head is None:
            return self.head
        if self.head.next is None:
            self.head=None
            return self.head
        curr=self.head
        while curr.next.next is not None:
            curr=curr.next
        curr.next=None
        return self.head
    def delete_Pos(self,pos):
        if pos<1:
            return self.head
        if self.head is None:
            return self.head
        if pos==1:
            self.head=self.head.next
            return self.head
        curr=self.head
        for i in range(1,pos-1):
            if curr is None:
                return self.head
            curr=curr.next
        if curr is None or curr.next is None:
            return self.head
        curr.next=curr.next.next
        return self.head
    def traverse(self):
        curr=self.head
        while curr is not None:
            print(curr.data, end="->")
            curr=curr.next
    def Search(self,x):
        curr=self.head
        while curr is not None:
            if curr.data==x:
                return True
            curr=curr.next
        return False

Links=Menu_code()
head=None
print("Enter your choice:")
print("1. Insert at beginning")
print("2. Insert at end")
print("3. Insert at position")
print("4. Delete from beginning")
print("5. Delete from end")
print("6. Delete from position")
print("7. Traverse")
print("8. Search")
print("9.Exit")
while True:
    
    match int(input("Enter Your choice: ")):
        case 1:
            i=int(input("Enter the value:"))
            head=Links.insertBegin(i)
        case 2:
            i=int(input("Enter the value:"))
            head=Links.insertEnd(i)
        case 3:
            i=int(input("Enter the value:"))
            pos = int(input("Enter position: "))
            head=Links.insert_Pos(i, pos)
        case 4:
            head=Links.deleteBegin()
        case 5:
            Links.deleteEnd()
        case 6:
            pos = int(input("Enter position: "))
            head=Links.delete_Pos(pos)
        case 7:
            Links.traverse()
        case 8:
            x = int(input("Enter element to search: "))
            if Links.Search(x):
                print("Element found")
            else:
                print("Element not found")
        case 9:
            break