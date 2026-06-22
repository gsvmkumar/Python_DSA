from Node import Node
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