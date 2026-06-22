from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements: ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head

x=int(input("Enter the value to delete: "))

cur=head
prev=None

lastNode=None
lastPrev=None

while cur is not None:
    if cur.data==x:
        lastNode=cur
        lastPrev=prev

    prev=cur
    cur=cur.next

if lastNode is None:
    print("Element not found")

elif lastPrev is None:
    head=head.next
    links.head=head

else:
    lastPrev.next=lastNode.next

temp=links.head
while temp is not None:
    print(temp.data,end="->")
    temp=temp.next
print("None")