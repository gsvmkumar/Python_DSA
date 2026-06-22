class Node:
    def __init__(self,x):
        self.data=x
        self.next=None
#finding the number of nodes in the linked list

class Menu_code:
    c=0
    def __init__(self):
        self.head=None
    def insertEnd(self,x):
        t=Node(x)
        Menu_code.c+=1
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
l=list(map(int,input("Enter the elements of the linked list: ").split()))
Links=Menu_code()
for i in l:
    head=Links.insertEnd(i)
print("Number of nodes in the linked list: ", Links.c)