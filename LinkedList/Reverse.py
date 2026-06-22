class Node:
    def __init__(self,x):
        self.data=x
        self.next=None

class Menu_code:
    def __init__(self):
        self.head=None
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
    def reverse(self):
        prev=None
        curr=self.head
        while curr is not None:
            t=curr.next
            curr.next=prev
            prev=curr
            curr=t
        self.head=prev
    def traverse(self):
        curr=self.head
        while curr is not None:
            print(curr.data, end="->")
            curr=curr.next
l=list(map(int,input("Enter the elements of the linked list: ").split()))
Links=Menu_code()
for i in l:
    head=Links.insertEnd(i)
Links.reverse()
Links.traverse()