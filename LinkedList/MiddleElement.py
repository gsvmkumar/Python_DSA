import LinkedListOP as ll
import Node
links=ll.Menu_code()
ls=list(map(int,input("Enter the elements: ").split()))
for i in ls:
    head=links.insertEnd(i)
links.traverse()
# temp=head

fp=head
sp=head


while fp.next!=None and fp!=None:
    fp=fp.next.next
    sp=sp.next
print("Middle element: ",sp.data)