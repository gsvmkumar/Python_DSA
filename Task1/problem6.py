from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements: ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head
x=int(input("Enter the value of x"))
less=[]
greater=[]

cur=head

while cur is not None:
    if cur.data<x:
        less.append(cur.data)
    else:
        greater.append(cur.data)
    cur=cur.next

newlist=ll()

for i in less:
    newlist.insertEnd(i)

for i in greater:
    newlist.insertEnd(i)

newlist.traverse()